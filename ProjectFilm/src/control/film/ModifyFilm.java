package control.film;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Film;
import bean.Utente;
import model.FilmManager;

/**
 * Servlet implementation class ModifyFilm
 */
@WebServlet("/ModifyFilm")
public class ModifyFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String  TitoloFilm,Trama, Locandina, Categoria;
		Utente us= (Utente)request.getSession().getAttribute("utente");
	
		TitoloFilm= (String) request.getSession().getAttribute("titoloFilm");
		Locandina= (String) request.getSession().getAttribute("locandina");
		
		
		
		Trama= request.getParameter("Trama");
		Categoria= request.getParameter("Categoria");
		
		
		
		Film film= new Film (TitoloFilm,Trama,Locandina,Categoria) ;
		film.setUs(us);
		

		try {
			FilmManager.ModifyFilm(film);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
			response.sendRedirect("Amministratore/FilmListAmministrator.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
