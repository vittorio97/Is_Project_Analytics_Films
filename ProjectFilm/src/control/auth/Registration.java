package control.auth;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Utente;
import model.AuthenticationManager;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static AuthenticationManager manager = new AuthenticationManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		
		
		String username= request.getParameter("username");
		
		String password = request.getParameter("password");
		
		String repeatPassword = request.getParameter("repeatPassword");
		
		if(password.equals(repeatPassword)){
			
			
			
	
		Utente user = new Utente();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		
		
		
	try {
			
			manager.add(user);
			
			response.sendRedirect("Utente/Homepage.jsp");

	} catch (SQLException e) {
	e.printStackTrace();
	}
	}
	
		else{
			response.sendRedirect("Utente/RegistrationError.jsp");
		}}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
