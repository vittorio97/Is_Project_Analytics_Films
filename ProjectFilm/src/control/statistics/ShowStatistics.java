package control.statistics;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.StatisticsManager;

/**
 * Servlet implementation class ShowStatisticsFilms
 */
@WebServlet("/ShowStatistics")
public class ShowStatistics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStatistics() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int reviewNumber=0;
		int filmNumber=0;
		int userNumber=0;
		
		
try {
			
	reviewNumber = StatisticsManager.ShowReviewsN();
	filmNumber = StatisticsManager.ShowFilmN();
	userNumber = StatisticsManager.ShowUserN();		
	System.out.println(filmNumber);
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		request.getSession().setAttribute("reviewNumber", reviewNumber);
		request.getSession().setAttribute("filmNumber", filmNumber);
		request.getSession().setAttribute("userNumber", userNumber);
		
		
		response.sendRedirect("Amministratore/Statistics.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
