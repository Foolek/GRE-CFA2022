package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TripDao;
import entities.Trip;
import persistance.DaoFactory;
import persistance.MySqlDaoFactory;

/**
 * Servlet implementation class TripCtrl
 */
@WebServlet("/TripCtrl")
public class TripCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DaoFactory myDaoFactory;
	List<Trip> listeTrips;
	TripDao tripDao;
	Trip trip;
	String name;


	public TripCtrl() {
		super();
		myDaoFactory = new MySqlDaoFactory();
		tripDao = myDaoFactory.getTripDao();
		trip = null;
		listeTrips = null ;
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//transmettre la liste des voyages
		listeTrips = tripDao.findAllTrips();
		request.setAttribute("list", listeTrips);

		//transmettre la liste des villes
		listeTrips = tripDao.findAllTrips();
		request.setAttribute("list2", listeTrips);


		RequestDispatcher rd = request.getRequestDispatcher("/insertTrip.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		doGet(request, response);
	}

}
