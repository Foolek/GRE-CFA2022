import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTripDao extends JdbcDao implements TripDao {

	public JdbcTripDao(Connection connection) {
		super(connection);
	}

	@Override
	public int createTrip(Trip trip) {
		try (PreparedStatement statement = getConnection().prepareStatement(
				"INSERT INTO " + "voyage(depart, arrivee, prix) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
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
		// insertion dans la table

	}

}