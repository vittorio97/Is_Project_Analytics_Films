package control.film;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Film;

import model.FilmManager;

@WebServlet("/modifyFilm")
public class ModifyFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static FilmManager managerFilm= new FilmManager();
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
		
		String TitoloFilm, Trama, Locandina, Categoria;
		
		
		TitoloFilm= request.getParameter("TitoloFilm");
		Trama= request.getParameter("Trama");
		Locandina= request.getParameter("Locandina");
		Categoria= request.getParameter("Categoria");
		
		
		
		Film film= new Film (TitoloFilm,Trama,Locandina,Categoria) ;
		

		try {
			FilmManager.ModifyFilm(film);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
			response.sendRedirect("Amministratore/FilmList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}