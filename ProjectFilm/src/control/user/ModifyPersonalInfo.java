package control.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.*;

import model.*;

/**
 * Servlet implementation class ModifyPersonalInfo
 */
@WebServlet("/ModifyPersonalInfo")
public class ModifyPersonalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyPersonalInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Email,Username,Pass,Ruolo;
			
		Utente utente= (Utente) request.getSession().getAttribute("utente");
		
		Email = utente.getEmail();
		Pass = utente.getPassword();
		Ruolo= utente.getRuolo();
		
		Username= request.getParameter("Username");
	
		Utente utente1= new Utente (Email,Username,Pass,Ruolo);
		
		

		try {
			UserManager.ModifyInfo(utente1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
			response.sendRedirect("Utente/Homepage.jsp");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
