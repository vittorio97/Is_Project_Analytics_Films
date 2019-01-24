package model;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bean.Recensione;
import connectionPool.ConnectionPool;


	public class ReviewManager {
		
		public boolean insertReview(Recensione r) throws SQLException {
			
			Connection con= ConnectionPool.getConnection();
			PreparedStatement pstmt= null;
			boolean rev = false;
			
			try{
				
				pstmt = con.prepareStatement(INSERT_REVIEW);
				
				pstmt.setString(1, r.getTitolo());
				pstmt.setString(2, r.getTesto());
				
				
			
				int reg = pstmt.executeUpdate();
				
				if(reg==1){
					rev=true;
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
			
			
			return rev;
			}
		
		
		
		
		
		private static final String INSERT_REVIEW = "INSERT INTO Recensione(Titolo,Testo) VALUES (?,?,?)";
		
	
	}
	

