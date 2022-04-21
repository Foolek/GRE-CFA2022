package TpTravelAgency.Dao;
import TpTravelAgency.JdbcDao;
import TpTravelAgency.Place;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class JdbcPlaceDao extends JdbcDao implements PlaceDao {

   
	private final String ORDRE_INSERT = "INSERT INTO place(name) VALUES (?)";
	private final String ORDRE_FINDBYREF ="SELECT id, name FROM place WHERE is = ?";
	private final String ORDRE_DELETE = "delete from place where id = ?";
	private final String ORDRE_FINDALL = "SELECT id, name FROM place";
	private final String ORDRE_UPDATE = "UPDATE place SET name = ? WHERE is = ?";
	
	public JdbcPlaceDao(Connection connection) {
        super(connection);
    }

    @Override
    public int createPlace(Place place) {
      
     PreparedStatement pstm;
     ResultSet resultSet = null ;
     int id = 0;
	 try {
		
		pstm = getConnection().prepareStatement(ORDRE_INSERT,RETURN_GENERATED_KEYS);
		pstm.setString(1, place.getName());
		pstm.executeUpdate();
        //recupération du numero id lors insertion
		resultSet = pstm.getGeneratedKeys();
        resultSet.next();
        id = resultSet.getInt(1); 
   
	} catch (SQLException e) {
		
		System.out.println(e.getMessage());
		 //throw new RuntimeException("Unable to create a place");
		
	}
	 return id;
                
                 
    
    }

    @Override
    public Place findPlaceById(int id) {
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
            if (statement.executeUpdate() == 1)
            	return true;
         } catch (SQLException e) {
           System.out.println("pas de supression possible place appartient à un voyage");
        }
		return false;
    }

    @Override
    public List<Place> findAllPlaces() {
        try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_FINDALL)) {
            List<Place> places = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                places.add(toPlace(resultSet));
            }
            return places;
        } catch (SQLException e) {
            throw new RuntimeException("Unable to find all places");
        }
    }

    private Place toPlace(ResultSet resultSet) throws SQLException {
        Place place = new Place();
        place.setId(resultSet.getInt(1));
        place.setName(resultSet.getString(2));
        return place;
    }
}
