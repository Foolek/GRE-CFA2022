import static java.sql.Statement.RETURN_GENERATED_KEYS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class JdbcPlaceDao extends JdbcDao implements PlaceDao {

	private final String ORDRE_INSERT = "INSERT INTO ville (Ville) VALUES (?)";
	private final String ORDRE_FINDBYREF = "SELECT RefVille, Ville FROM ville WHERE RefVille = ?";
	private final String ORDRE_DELETE = "DELETE FROM ville WHERE RefVille = ? ";
	private final String ORDRE_FINDALL = "SELECT * FROM ville";
	private final String ORDRE_UPDATE = "UPDATE ville SET Ville = ? WHERE RefVille = ?";

	public JdbcPlaceDao(Connection connection) {
		super(connection);
	}

	@Override
	public int createPlace(Place place) {

		String PlaceToInsert = null;
		PreparedStatement pstm;
		ResultSet resultSet = null;
		int id = 0;
		PlaceToInsert = place.getName();

		try {

			pstm = getConnection().prepareStatement(ORDRE_INSERT, RETURN_GENERATED_KEYS);
			pstm.setString(1, PlaceToInsert);
			pstm.executeUpdate();
			// recupération du numero id lors insertion
			resultSet = pstm.getGeneratedKeys();
			resultSet.next();
			id = resultSet.getInt(1);

		} catch (SQLException e) {
			if (e.getErrorCode() == 1062)
				JOptionPane.showMessageDialog(null, "Ville: " + PlaceToInsert + " déjà saisie.", "Erreur",
						JOptionPane.WARNING_MESSAGE, null);
			id = 0;
		}
		return id;
	}// fin create place

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
			throw new RuntimeException("Impossible de retrouver la ville avec l'ID: " + id, e);
		}
	}

	@Override
	public boolean updatePlace(Place place) {
		try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_UPDATE)) {
			statement.setString(1, place.getName());
			statement.setInt(2, place.getId());
			boolean result = statement.executeUpdate() == 1;

			return result;
		} catch (SQLException e) {
			throw new RuntimeException("Impossible de modifier le nom de cette ville: " + place, e);
		}
	}

	@Override
	public boolean removePlace(Place place) {
		try (PreparedStatement statement = getConnection().prepareStatement(ORDRE_DELETE)) {
			statement.setInt(1, place.getId());
			if (statement.executeUpdate() == 1)
				return true;
		} catch (SQLException e) {
			System.out.println("Pas de supression possible, voyage existant"); // console
			if (e.getErrorCode() == 2) {
				JOptionPane.showMessageDialog(null, "Suppression impossible, ville appartenant à un voyage", "Erreur",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return true;
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
			throw new RuntimeException("Impossible d'afficher toutes les villes");
		}
	}

	private Place toPlace(ResultSet resultSet) throws SQLException {
		Place place = new Place(resultSet.getInt(1), resultSet.getString(2));
		return place;
	}
}
