package control.review;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.*;
import model.ReviewManager;

/**
 * Servlet implementation class InsertReview
 */
@WebServlet("/InsertReview")
public class InsertReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertReview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String Titolo,Testo;
				
		Titolo = request.getParameter("Titolo");
		Testo = request.getParameter("Testo");
		Utente u= (Utente)request.getSession().getAttribute("utente");
		Film f = (Film) request.getSession().getAttribute("TitoloFilm");
				
		Recensione recensione= new Recensione (Titolo,Testo);
		recensione.setU(u);
		recensione.setF(f);
		
		
		try {
			ReviewManager.insertReview(recensione);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		RequestDispatcher dispatcher= request.getRequestDispatcher("ShowReviews?Titolo="+f.getTitoloFilm());
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
