package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bean.Utente;
import connectionPool.ConnectionPool;


/**
 * Verifica il login di un utente
 * @param u: {@link Utente}
 * @throws SQLException
 */
	public class AuthenticationManager {
		
		public static Utente login(String email, String password) throws SQLException {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			con = ConnectionPool.getConnection();

			pstmt = con.prepareStatement(CHECK_USER);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			Utente user = new Utente();

			ResultSet rset = pstmt.executeQuery();
			
			if (rset.next()) {
				user.setEmail(rset.getString("Email"));
				user.setUsername(rset.getString("Username"));
				user.setPassword(rset.getString("Password"));
				user.setRuolo(rset.getString("Ruolo"));
				

				pstmt.close();
				con.close();

				return user;
				
			} else {
				
				pstmt.close();
				con.close();

				return user;
			}
		}
		
		/**
		 * Inserisce un nuovo utente nel database
		 * @param u: {@link Utente}
		 * @throws SQLException
		 */
		 public boolean registration(Utente u) throws SQLException {
			
			Connection con = ConnectionPool.getConnection();
			PreparedStatement pstmt = null;
			boolean registrator = false;
			
			try{
				pstmt = con.prepareStatement(NEW_USER);
				pstmt.setString(1, u.getEmail());
				pstmt.setString(2, u.getUsername());
				pstmt.setString(3, u.getPassword());
				pstmt.setString(4,"Utente");
			
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
					ConnectionPool.releaseConnection(con);
				}
			}
			
			
			return registrator;
			}
		
		
		private static final String CHECK_USER = "SELECT * FROM Utente WHERE Email = ? AND Password = ?";
		private static final String  NEW_USER = "INSERT INTO Utente (Email,Username,Password,Ruolo) VALUES (?,?,?,?)";
	
	}
	


