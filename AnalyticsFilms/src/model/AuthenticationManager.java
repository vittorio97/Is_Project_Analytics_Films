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
		
		public Utente login(String email, String password) throws SQLException {
			Connection connection= ConnectionPool.getConnection();
			PreparedStatement pStatement= null;
			
			Utente utente= null;
			
			try {
				pStatement= connection.prepareStatement(CHECK_USER);
				pStatement.setString(1, email);
				pStatement.setString(2, password);
				ResultSet rs= pStatement.executeQuery();
				while(rs.next()) {
					utente= new Utente();
					utente.setEmail(rs.getString("email"));
					utente.setUsername(rs.getString("username"));
					utente.setRuolo(rs.getString("ruolo"));
					
				
				}
			}finally {
				try {
					if(pStatement!= null) {
						pStatement.close();
					}
				}finally {
					ConnectionPool.releaseConnection(connection);
				}
			}
			
			return utente;
		}
		
		/**
		 * Inserisce un nuovo utente nel database
		 * @param u: {@link Utente}
		 * @throws SQLException
		 */
		 public boolean add(Utente u) throws SQLException {
			
			Connection con = ConnectionPool.getConnection();
			
			PreparedStatement pstmt = null;
			boolean registrator = false;
			
			try{
				pstmt = con.prepareStatement(NEW_USER);
				
				pstmt.setString(1, u.getEmail());
				pstmt.setString(2, u.getUsername());
				pstmt.setString(3, u.getPassword());
				pstmt.setString(4,"Utente registrato");
			
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
		
		
		private static final String CHECK_USER = "SELECT * FROM Utente WHERE Email = ? AND Password = ?";
		private static final String  NEW_USER = "INSERT INTO Utente (Email,Username,Password,Ruolo) VALUES (?,?,?,?)";
	
	}
	


