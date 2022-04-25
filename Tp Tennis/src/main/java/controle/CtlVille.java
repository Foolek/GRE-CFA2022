package controle;

import dao.CourtDAO;
import dao.VilleDao;
import entities.Court;
import entities.Ville;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CtlVille", urlPatterns = "/CtlVille")
public class CtlVille extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Ville> listeVille;

	public CtlVille(){super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		VilleDao villeDao = new VilleDao();

		try {
			listeVille = villeDao.findAllVille();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		request.setAttribute("list",listeVille);
		RequestDispatcher rd = request.getRequestDispatcher("/enregistrementVille.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomcourt = request.getParameter("txNomVille");
		RequestDispatcher rd = null;

		if(addCourt(nomcourt) == 1062) {
			request.setAttribute("msgInsert", "nom de ville :  deja saisie");
		}
		else {
			request.setAttribute("msgInsert", "success");
		}

		VilleDao villeDao = new VilleDao();

		try {
			listeVille = villeDao.findAllVille();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		request.setAttribute("list",listeVille);
		rd = request.getRequestDispatcher("/enregistrementVille.jsp");
		rd.forward(request, response);
	}

	private int addCourt(String nomville) {

		Ville uneVille = new Ville (nomville);
		VilleDao villeDao = new VilleDao();
		return (villeDao.ajouterVille( uneVille));
	}
}
