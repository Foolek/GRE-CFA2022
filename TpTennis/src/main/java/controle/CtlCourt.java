package controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CourtDAO;
import entities.Court;

/**
 * Servlet implementation class CtlCourt
 */
@WebServlet(name = "CtlCourt", urlPatterns = "/CtlCourt")
public class CtlCourt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<Court> listeCourts;

    public CtlCourt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
	    	CourtDAO courtDAO = new CourtDAO();  
	    			
			try {
				listeCourts=courtDAO.findAllCourt();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		request.setAttribute("list",listeCourts);
		RequestDispatcher rd = request.getRequestDispatcher("/enregistrementCourt.jsp"); 
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomcourt = request.getParameter("txNomCourt");
		RequestDispatcher rd = null;
		
		if(addCourt(nomcourt) == 1062) {
			request.setAttribute("msgInsert", "nom de court :  deja saisie");
		}
		else {
			request.setAttribute("msgInsert", "success");
		}
		
		CourtDAO courtDAO = new CourtDAO();  
		
		try {
			listeCourts = courtDAO.findAllCourt();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("list",listeCourts);
		rd = request.getRequestDispatcher("/enregistrementCourt.jsp"); 
        rd.forward(request, response);	
	}
	
	private int addCourt(String nomcourt) {
		
		Court unCourt = new Court (nomcourt);
	   	CourtDAO courtDAO = new CourtDAO();
		return (courtDAO.ajouterCourt( unCourt));
	}
}