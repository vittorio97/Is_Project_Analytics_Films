package controller.review;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Recensione;

import model.ReviewManager;;

@WebServlet("/review")
public class InsertReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ReviewManager managerReview= new ReviewManager();
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
		String Titolo,Testo;
		
		
		
		Titolo = request.getParameter("Titolo");
		Testo = request.getParameter("Testo");
		
				
		
		
		Recensione recensione= new Recensione (Titolo,Testo) ;
		

		try {
			ReviewManager.insertReview(recensione);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
			response.sendRedirect("Utente/FilmList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
