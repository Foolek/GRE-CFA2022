package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Place;
import java.util.List;
import dao.PlaceDao;
import persistance.DaoFactory;
import persistance.MySqlDaoFactory;

/**
 * Servlet implementation class placeCtrl
 */
@WebServlet("/PlaceCtrl")
public class PlaceCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DaoFactory myDaoFactory;
	PlaceDao placeDao;
	Place place; 
	List<Place> listePlaces;
	
	public PlaceCtrl() {
	    super();
	    myDaoFactory = new MySqlDaoFactory();
	    placeDao = myDaoFactory.getPlaceDao();
	  	place = null;
	  	listePlaces = null ; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		listePlaces = placeDao.findAllPlaces();
		request.setAttribute("list", listePlaces);
		RequestDispatcher rd = request.getRequestDispatcher("/insertVille.jsp"); 
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomPlace = request.getParameter("txNomVille");
		RequestDispatcher rd = null;
		place = new Place(nomPlace);
		
		
		if(addPlace(place) == 1062) {
			request.setAttribute("msgInsert", "nom de ville :  deja saisie");
		}
		else {
			request.setAttribute("msgInsert", "success");
		}
		
		doGet(request, response);
		
	}
	private int addPlace(Place place) {
		int id	= placeDao.createPlace(place) ;
		return id;
	}

}
