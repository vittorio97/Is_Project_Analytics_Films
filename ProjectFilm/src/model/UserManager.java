
package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;


import bean.Utente;
import connectionPool.ConnectionPool;

public class UserManager {
	

	public static Utente ShowPersonalInfo(String Email) throws SQLException{
		
		Utente utente = null;
		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;


		pstmt = con.prepareStatement(SHOW_INFO);

		rs= pstmt.executeQuery();

		while(rs.next()){
			String email = rs.getString("Email");
			String username= rs.getString("Username");
			String password=rs.getString("Pass");
			String ruolo=rs.getString("Ruolo");

			utente= new Utente (email,username,password,ruolo);
}
			
			return utente;
	}


	public static Collection <Utente> ShowUserList() throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		Collection <Utente> utenti=new ArrayList<Utente>();



		pstmt = con.prepareStatement(SHOW_USERS);

		rs= pstmt.executeQuery();

		while(rs.next()){
			String email = rs.getString("Email");
			String username= rs.getString("Username");
			String password=rs.getString("Pass");
			String ruolo=rs.getString("Ruolo");


			utenti.add(new Utente(email,username,password,ruolo));

		}

		return utenti;
	}
	public static boolean DeleteAccount(String Email) throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		boolean registrator = false;
		try{
			pstmt = con.prepareStatement(DELETE_ACCOUNT);
			
			pstmt.setString(1, Email);
			
			int reg = pstmt.executeUpdate();

			if(reg==1){
				registrator=true;
			}

			con.commit();

		}finally{
			try{
				if(pstmt!=null) {
					pstmt.close();

				}
			}finally{

			}
		}


		return registrator;
	}

	public static boolean ModifyInfo(Utente utente) throws SQLException
	{
		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		boolean registrator = false;
		try{
			
			pstmt = con.prepareStatement(MODIFY_USER);
			
			pstmt.setString(1, utente.getUsername());
			pstmt.setString(2, utente.getEmail());
				
			

			int reg = pstmt.executeUpdate();
			
			
			if(reg==1){
				registrator=true;
			}

			con.commit();

		}finally{
			try{
				if(pstmt!=null) {
					pstmt.close();

				}
			}finally{

			}
		}


		return registrator;
	}



	


	private static final String SHOW_INFO= "SELECT * FROM Utente WHERE Email= ?";
	private static final String SHOW_USERS = "SELECT * FROM Utente";
	private static final String DELETE_ACCOUNT = "DELETE FROM Utente where Email = ?";
	private static final String MODIFY_USER= "UPDATE Utente SET  Username= ?  WHERE Email = ?";
	

}


