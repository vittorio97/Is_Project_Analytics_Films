package controller.search;

	import java.io.IOException;



	import java.sql.SQLException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	
	import bean.Film;
	import model.SearchManager;

	/**
	 * Servlet class SearchFilm
	 */
	@WebServlet("/SearchFilm")
	public class SearchFilm extends HttpServlet {
		private static final long serialVersionUID = 1L;
		

	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public SearchFilm() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String titolo= request.getParameter("TitoloFilm");
			Film film = new Film();
			
			try {
				film = SearchManager.searchByTitolo(titolo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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