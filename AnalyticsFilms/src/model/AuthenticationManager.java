package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bean.Utente;
import connectionPool.ConnectionPool;
	

	/**
	 * Classe Authentication Manager
	 * @author Vittorio
	 */
	public class AuthenticationManager {
		
		/**
		 * Inserisce un nuovo utente nel database
		 * @param u: {@link Utente}
		 * @throws SQLException
		 */
		public static void registration(Utente u) throws SQLException {
			
			Connection con = ConnectionPool.getConnection();
			PreparedStatement pstmt = null;
			
			pstmt = con.prepareStatement(NEW_USER);
			pstmt.setString(1, u.getEmail());
			pstmt.setString(2, u.getUsername());
			pstmt.setString(3, u.getPassword());
		
			pstmt.executeUpdate();

			pstmt.close();
			con.close();
		}
		
		/**
		 * Controlla che le credenziali inserite corrispondano ad un account utente
		 * @param email: email 
		 * @param password: password
		 * @return {@link Utente}
		 * @throws SQLException
		 */
		public static Utente login(String email, String password) throws SQLException {
			
			Connection con = ConnectionPool.getConnection();
			PreparedStatement pstmt = null;
			Utente utente= null;
			
			try {
			pstmt = con.prepareStatement(CHECK_USER);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet rset = pstmt.executeQuery();
			
			while(rset.next()) {
				utente= new Utente();
				utente.setEmail(rset.getString("email"));
				utente.setUsername(rset.getString("Username"));
				utente.setPassword(rset.getString("Password"));
				utente.setRuolo(rset.getString("Ruolo"));
			}
		}finally {
			try {
				if(pstmt!= null) {
					pstmt.close();
				}
			}finally {
				ConnectionPool.releaseConnection(connection);
			}
		}
		
		return utente;
	
			
		}
		
	
		private static final String CHECK_USER = "SELECT * FROM Utente WHERE Email = ? AND Password = ?";
		private static final String  NEW_USER = "INSERT INTO Utente VALUES (?,?,?)";
	
	}


