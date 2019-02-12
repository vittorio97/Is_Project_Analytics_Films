package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.*;
import connectionPool.ConnectionPool;

public class ReviewManager {
	
	
	
	public static boolean insertReview(Recensione r) throws SQLException {
		
		Connection con= ConnectionPool.getConnection();
		PreparedStatement pstmt= null;
		boolean rev = false;
		
		try{
			
			pstmt = con.prepareStatement(INSERT_REVIEW);
			
			pstmt.setString(1, r.getTitolo());
			pstmt.setString(2, r.getTesto());
			pstmt.setString(3, r.getU().getEmail());
			pstmt.setString(4, r.getF().getTitoloFilm());
		
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
				ConnectionPool.releaseConnection(con);
			}
		}
		
		
		return rev;
		}
	
	public static Collection <Recensione> ShowReviewList(String TitoloFilm) throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		Collection <Recensione> reviews =new ArrayList<Recensione>();



		pstmt = con.prepareStatement(SHOW_REVIEWS);
		
		pstmt.setString(1,TitoloFilm);
		rs= pstmt.executeQuery();
		
		

		while(rs.next()){
			
			Recensione rev = new Recensione();
			
			rev.setTitolo(rs.getString("Titolo"));
			rev.setTesto(rs.getString("Testo"));
					
			
			
			reviews.add(rev);

		}

		return reviews;
	}
		
	
	
	private static final String SHOW_REVIEWS = "SELECT * "
			+ "FROM (Recensione "
			+ "INNER JOIN Film ON (Recensione.TitoloFilm = Film.TitoloFilm)) "
			+ "WHERE Film.TitoloFilm = ?";
	
	
	private static final String INSERT_REVIEW = "INSERT INTO Recensione(Titolo,Testo,Email,TitoloFilm) VALUES (?,?,?,?)";
	

}


