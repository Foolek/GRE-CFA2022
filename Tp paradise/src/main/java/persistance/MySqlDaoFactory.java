package persistance;

import dao.JdbcPlaceDao;
import dao.JdbcTripDao;

public class MySqlDaoFactory extends DaoFactory {

	  public  MySqlDaoFactory() {
      		    super();
	    }

	   public  JdbcPlaceDao getPlaceDao() {
	        return new JdbcPlaceDao(ConnectionManager.getConnection());
	    }

	   public  JdbcTripDao getTripDao() {
	        return new JdbcTripDao(ConnectionManager.getConnection());
	    }

}
