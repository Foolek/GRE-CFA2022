public abstract class DaoFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;

	public DaoFactory() {
	}

	// There will be a method for each DAO that can be created.
	// The concrete factories will have to implement these methods.
	public abstract JdbcPlaceDao getPlaceDao();

	public abstract JdbcTripDao getTripDao();

	public static DaoFactory getDaoFactory(int whichFactory) {
		switch (whichFactory) {
		case MYSQL:
			return new MySqlDaoFactory();
		// case ORACLE : return new OracleDAOFactory();
		// case SYBASE : return new SybaseDAOFactory();
		default:
			return null;
		}
	}

}
