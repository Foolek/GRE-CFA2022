package TpTravelAgency;

import TpTravelAgency.Dao.JdbcPlaceDao;
import TpTravelAgency.Dao.JdbcTripDao;

public class MySqlDaoFactory extends DaoFactory {

	  public  MySqlDaoFactory() {
      		    super();
	    }

	   public JdbcPlaceDao getPlaceDao() {
	        return new JdbcPlaceDao(ConnectionManager.getConnection());
	    }

    	@Override
    	public JdbcTripDao getTripDao()
    	{
		  return new JdbcTripDao(ConnectionManager.getConnection());
    	}

}
