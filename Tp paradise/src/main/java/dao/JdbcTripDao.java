package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Place;
import entities.Trip;
import entities.Place;
import entities.Trip;
import dao.JdbcDao;


public class JdbcTripDao extends JdbcDao implements TripDao {

	private final String ORDRE_INSERT = "INSERT INTO trips(depart, destination, price) VALUES (?, ?, ?)";
	private final String ORDRE_FINDALL = "select depart, destination, price FROM trips";

	// connection pour  new JdbcPlaceDao( this.connection).findPlaceById(idDestination); methode toTrip modif p.p avril 2022 
	Connection connection;

	public JdbcTripDao(Connection connection) {

		super(connection);
		this.connection = connection;

	}

	@Override
	public int createTrip(Trip trip) {
		try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_INSERT, Statement.RETURN_GENERATED_KEYS)) {
			statement.setInt(1, trip.getDepart().getId());
			statement.setInt(2, trip.getDestination().getId());
			statement.setInt(3, trip.getPrice());
			statement.executeUpdate();
			ResultSet resultSet = statement.getGeneratedKeys();
			resultSet.next();
			int id = resultSet.getInt(1);
			return id;
		} catch (SQLException e) {
			throw new RuntimeException("Unable to insert this trip: " + trip, e);
		}
		//insertion dans la table


	}


	//creation de la methode lisalltrips
	@Override
	public List<Trip> findAllTrips() {
		try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_FINDALL)) {
			List<Trip> listTrip = new ArrayList<>();
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Trip oneTrip = toTrip(resultSet);
				listTrip.add(oneTrip);
			}
			return listTrip;
		} catch (SQLException e) {
			throw new RuntimeException("Unable to find all places");
		}
	}

	private Trip toTrip(ResultSet resultSet) throws SQLException {
		//place depart , place destination
		int idDepart = resultSet.getInt(1);
		System.out.println(idDepart);
		//select by id place
		//connexion
		Place depart = new JdbcPlaceDao( this.connection).findPlaceById(idDepart);

		int idDestination =resultSet.getInt(2);
		System.out.println(idDestination);
		Place destination = new JdbcPlaceDao( this.connection).findPlaceById(idDestination);

		int prix = resultSet.getInt(3);
		System.out.println(prix);

		Trip trip = new Trip(depart, destination, prix );

		return trip;
	}




}
