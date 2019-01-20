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
 * Servlet implementation class Registrazione
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
    }   
       

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String username= request.getParameter("username");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	Utente user = new Utente();
	
	user.setUsername(username);
	user.setEmail(email);
	user.setPassword(password);
	
 
try {
		
		manager.registration(user);
		response.sendRedirect("Homepage.jsp");

} catch (SQLException e) {
e.printStackTrace();
}


}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	doGet(request,response);
	
}
}


