package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Court;

public class CourtDAO  {
	//objet connectJavaSql instanci� une seule fois partage par tout objets de la classe 
	static Connection connectJavaSql;
	private List<Court> listeCourts;
	
	private final String ORDRE_INSERT = "insert into court(Nom) values (?)";
	private final String ORDRE_FINDALL = "select nom from court";

	public CourtDAO() {
		setListeCourts(new ArrayList<Court>());
		connectJavaSql= null;
	}
	
	public static boolean Connection(){
		
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://141.94.221.173:3306/tennis";
		connectJavaSql = DriverManager.getConnection(url,"adil","Yas21n934&&");

	  }
	  catch(SQLException | ClassNotFoundException  e)
	  {
		  System.out.println(e.getMessage());
	  }
		
	  if (connectJavaSql != null )
		  return true;
	  else
    	  return false;
	}
	
	
	public int ajouterCourt(Court unCourt) {
		
		System.out.println("unCourt.getNom():" +unCourt.getNom());
	
		if(unCourt.getNom().isEmpty())
	    	unCourt.setNom(null);
		
		if(!Connection())
			System.out.println("echec connection data base");
		
		try {
			PreparedStatement pst = connectJavaSql.prepareStatement(ORDRE_INSERT);
			System.out.println("pst: "+ pst);
			pst.setString(1, unCourt.getNom());
			pst.executeUpdate();
			//connectJavaSql.commit(); insert required : Can't call commit when autocommit=true 0   modif avril 2022
		//	daoFactory.closeConnexion(connexion);
		} catch (SQLException e) {
		
			if (e.getErrorCode()== 1062) {
		    	System.out.println("Duplicate entry : " + e.getMessage() +" "+ e.getErrorCode());
    	          return e.getErrorCode(); 
		  }
			System.out.println("insert required : " + e.getMessage() +" "+ e.getErrorCode());
			
		/*	if (e.getErrorCode()== 1048) {
			    	System.out.println("insert required : " + e.getMessage() +" "+ e.getErrorCode());
	
		          return e.getErrorCode(); 
			  }*/
		}
    	System.out.println("insert succeed");
    	
		return -1;
	}
	
	public List<Court> findAllCourt()  throws SQLException{	
		if(!Connection())
			System.out.println("echec connection data base");
		
		 List<Court>listeCourts = new ArrayList<Court>();
		try {
			
			//ppas besoin de psmt utilisation de requ�te directe
			Statement stm = connectJavaSql.createStatement();
			ResultSet resultSet = stm.executeQuery(ORDRE_FINDALL);
		
			while (resultSet.next()) {
				Court c = new Court();
				c.setNom(resultSet.getString("Nom"));
				listeCourts.add(c);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
		}
		finally {
		//	daoFactory.closeConnexion(connexion);
		}
		return listeCourts;
	}

	public List<Court> getListeCourts() {
		return listeCourts;
	}

	public void setListeCourts(List<Court> listeCourts) {
		this.listeCourts = listeCourts;
	}

}
