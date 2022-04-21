import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	/**************** LOCAL HOST ****************/
	private static final String URL = "jdbc:mysql://localhost:3306/tpvoyage";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private static Connection CONNECTION;

	public static Connection getConnection() {

		try {
			CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Unable to create connection with database url: " + URL);
			System.exit(-1);
		}

		return CONNECTION;
	}

	public static void close() {
		try {
			CONNECTION.close();
		} catch (SQLException e) {
			System.out.println("Unable to close connection");
		}
	}
}
