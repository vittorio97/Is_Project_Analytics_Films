package control.auth;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Utente;
import model.AuthenticationManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static AuthenticationManager managerLogin= new AuthenticationManager();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Utente user=null;
		try {
			user = managerLogin.login(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		if(user!=null){
			
		request.getSession().setAttribute("utente", user);
		
		
		if(user.getRuolo().equals("Amministratore")){
			
			response.sendRedirect("Amministratore/MyPersonalAmministrator.jsp");
			
		}
		if(user.getRuolo().equals("Utente registrato")){
			
			response.sendRedirect("Utente/HomePageLog.jsp");
		}
		}
		else{
			response.sendRedirect("Utente/ErroreCredenziali.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}