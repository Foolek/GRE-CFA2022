package TpTravelAgency;

public class mainCoursDao {

	
	public static final int MYSQL = 1;
	public static final int ORACLE = 2; 
	public static final int SYBASE = 3;
	
	public static void main(String[] args) {
		new Launcher(DaoFactory.getDaoFactory(MYSQL)).start();
	
	}

}
