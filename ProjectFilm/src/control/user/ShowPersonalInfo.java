package control.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Utente;

import model.UserManager;

/**
 * Servlet implementation class ShowPersonalInfo
 */
@WebServlet("/ShowPersonalInfo")
public class ShowPersonalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPersonalInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Email;
		Utente utente = null;
		Utente u  = (Utente) request.getSession().getAttribute("utente");
		Email= u.getEmail();
		
		try {
			utente = UserManager.ShowPersonalInfo(Email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
			
			
			
			response.sendRedirect("Utente/ShowPersonalInfo.jsp");
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
