package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Place;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class JdbcPlaceDao extends JdbcDao implements  PlaceDao  {
   
	private final String ORDRE_INSERT = "INSERT INTO places(name) VALUES (?) ";
	private final String ORDRE_FINDBYREF = "SELECT id, name FROM places WHERE id = ?";
	private final String ORDRE_DELETE = "delete from places where id = ?";
	private final String ORDRE_FINDALL = "SELECT id, name FROM places";
	private final String ORDRE_UPDATE =  "UPDATE places SET name = ? WHERE id = ?";
	
	public JdbcPlaceDao(Connection connection) {
        super(connection);
    }
	
	

    @Override
    public int createPlace(Place place) {
      
     PreparedStatement pstm;
     ResultSet resultSet = null ;
     int id = 0;
     String PlaceToInsert = null;
     try {
		
		pstm = getConnection().prepareStatement(ORDRE_INSERT,RETURN_GENERATED_KEYS);
		PlaceToInsert = place.getName();
	    pstm.setString(1, PlaceToInsert);
	    pstm.executeUpdate();
		 //recup�ration du numero id lors insertion
		resultSet = pstm.getGeneratedKeys();
        resultSet.next();
        id = resultSet.getInt(1); //retourne id= 0 si num error = 1048
     
        
	} catch (SQLException e) {
		
		/*modif le 04/04/2022 work in progress le jtextfield.gettext renvoi "" mais e.getErrorCode()== 1048 besoin NULL*/   
		if (e.getErrorCode()== 1048) {
		    	System.out.println("la saisie est obligatoire: " + e.getMessage() +" "+ e.getErrorCode());
	            id = 0;
		 }
	      //regarder les diapos sql mysql 05 05-AP-InsertDeleteData.pdf DOUBLON violant une contrainte unique 
		 if (e.getErrorCode()== 1062) {
	   		JOptionPane.showMessageDialog(null, "place: "+ PlaceToInsert +" deja saisie" , "Message", JOptionPane.ERROR_MESSAGE);
     	     id = 0;
		 }
		        
	}
	 return id;
   }
    
    @Override
    public Place findPlaceById(int id) {
    
    	//SELECT id, name FROM places WHERE id = 30
    	try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_FINDBYREF)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return toPlace(resultSet);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Unable to retrieve place with id: " + id, e);
        }
    }

    @Override
    public boolean updatePlace(Place place) {
        try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_UPDATE)) {
            statement.setString(1, place.getName());
            statement.setInt(2, place.getId());
            boolean result = statement.executeUpdate() == 1 ;
        
            return result;
        } catch (SQLException e) {
            throw new RuntimeException("Unable to update this place: " + place, e);
        }
    }

    @Override
    public boolean removePlace(Place place) {
        try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_DELETE)) {
            statement.setInt(1, place.getId());
           
            //retorune le nbre de row affect�
            if (statement.executeUpdate() == 1) {
               //getConnection().commit(); //Can't call commit when autocommit=true SELECT @@autocommit;
            	return true;
            }
         } catch (SQLException e) {
        	 System.out.println(e.getMessage() + e.getErrorCode());
             if (e.getErrorCode() == 1451) {
           		JOptionPane.showMessageDialog(null, "pas de supression possible place appartient � un voyage" , "Message", JOptionPane.ERROR_MESSAGE);
                return false;
             }
        }
		return true;
		
    }

    @Override
    public List<Place> findAllPlaces() {
        try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_FINDALL)) {
            List<Place> Listplace = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            	Place oneplace = toPlace(resultSet);     	
            	Listplace.add(oneplace);
            }
            return Listplace;
        } catch (SQLException e) {
            throw new RuntimeException("Unable to find all places");
        }
    }

    private Place toPlace(ResultSet resultSet) throws SQLException {
        Place place = new Place(resultSet.getInt(1), resultSet.getString(2));
      
        return place;
    }
}
