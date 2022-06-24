package persistance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	
   private static final String URL = "jdbc:mariadb://141.94.221.173:3306/acosparla_travelagency";

    
    private static final String USER = "adil";
    private static final String PASSWORD = "Rampage934&&";
    private static Connection connectJavaSql;

    public static Connection getConnection() {
       
      	
            try {
               //cj for mysql connection ver 8.0.28
            	Class.forName(org.mariadb.jdbc.Driver.class.getName());
            	connectJavaSql = DriverManager.getConnection(URL, USER, PASSWORD);
              
            } catch (SQLException | ClassNotFoundException e) {
            	System.out.println(e.getMessage());
            	System.out.println("Unable to create connection with database url: " + URL);
                System.exit(-1);
            }
     
        return connectJavaSql;
    }

    public static void close() {
        try {
        	connectJavaSql.close();
        } catch (SQLException e) {
        	System.out.println("Unable to close connection");
        }
    }
}
