package control.auth;



import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Prodotto;
import model.ProdottoDAO;

/**
 * Servlet per la ricerca di prodotti dalla search-bar e dal menu
 * @author Antonio
 */
@WebServlet("/searchServlet")
public class RicercaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public RicercaServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String prodottoCercato = request.getParameter("prodottoCercato");
		ArrayList<Prodotto> risultati = new ArrayList<Prodotto>();
		
		if (prodottoCercato != null) {
			
			if (prodottoCercato.matches("[0-9a-zA-Z ]*$")) {
				
				try {
					risultati = ProdottoDAO.search(prodottoCercato);
					
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			} else
				System.out.println("Qualcosa di sbagliato");
		}
		if (request.getParameter("ricercaMenu") != null) {
			
			String produttore = request.getParameter("produttore");
			String piattaforma = request.getParameter("piattaforma");
			String nome = request.getParameter("nome");
			
			if (!produttore.equals("0") && !nome.equals("0")) {
				
				try {
					risultati = Prodotto.searchFromMenuNav(produttore, nome);
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
			} else if (!piattaforma.equals("0")) {
				
				try {
					risultati = Prodotto.searchFromMenuGiochi(piattaforma);
				
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				
			} else if (!nome.equals("0")) {
				
				try {
					risultati = Prodotto.searchFromMenuConsole(nome);
				
				} catch (SQLException e) {
			
					e.printStackTrace();
				}
			}
		}
		
		request.getSession().setAttribute("risultati", risultati);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/prova.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}