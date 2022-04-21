package dao;

import entities.Court;
import entities.Ville;

import java.sql.Connection;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VilleDao {

	static Connection connectJavaSql;
	private List<Ville> listeVille;

	private final String ORDRE_INSERT = "insert into ville(nom) values (?)";
	private final String ORDRE_FINDALL = "select nom from ville";


	public VilleDao(){
		setListeVille(new ArrayList<Ville>());
		connectJavaSql=null;
	}

	public static boolean Connection(){

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/voyageDB";
			connectJavaSql = DriverManager.getConnection(url,"root","");

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


	public int ajouterVille(Ville uneVille){
		System.out.println("uneVille.getNom():" +uneVille.getNom());

		if(uneVille.getNom().isEmpty()){
			uneVille.setNom(null);
		}
		if (!Connection()){
			System.out.println("Echec de la connexion à la base de donnée");
		}


		try{

			PreparedStatement pst = connectJavaSql.prepareStatement(ORDRE_INSERT);
			System.out.println("pst:" + pst);
			pst.setString(1, uneVille.getNom());
			pst.executeUpdate();

		}catch (SQLException e){

			if (e.getErrorCode()== 1062) {
				System.out.println("Duplicate entry : " + e.getMessage() +" "+ e.getErrorCode());
				return e.getErrorCode();
			}
			System.out.println("insert required : " + e.getMessage() +" "+ e.getErrorCode());
		}

		System.out.println("insert succeed");
		return -1;
	}

	public List<Ville> findAllVille() throws SQLException{
		if(!Connection()){
			System.out.println("Echec de la connexion à la base de donnée");
		}
		List<Ville>listeVille = new ArrayList<Ville>();


		try {

			//ppas besoin de psmt utilisation de requ�te directe
			Statement stm = connectJavaSql.createStatement();
			ResultSet resultSet = stm.executeQuery(ORDRE_FINDALL);

			while (resultSet.next()) {
				Ville c = new Ville();
				c.setNom(resultSet.getString("Nom"));
				listeVille.add(c);
			}


		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
		}
		finally {
			//	daoFactory.closeConnexion(connexion);
		}
		return listeVille;

	}

	public List<Ville> getListeVille() {
		return listeVille;
	}

	private void setListeVille(List<Ville> listeVille) {
		this.listeVille = listeVille;
	}



}
