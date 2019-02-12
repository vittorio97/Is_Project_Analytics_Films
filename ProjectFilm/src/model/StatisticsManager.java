package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connectionPool.ConnectionPool;

public class StatisticsManager {
	
	
	public static int ShowReviewsN() throws SQLException {
		
		Connection con= ConnectionPool.getConnection();
		PreparedStatement pstmt= null;	
		ResultSet rs = null;
		int showReviews=0;
		pstmt = con.prepareStatement(SHOW_REVIEWS_N);
					
		rs= pstmt.executeQuery();
		while(rs.next()){
		showReviews = rs.getInt("countReview");
		}
		return showReviews;
		
	}
	public static int ShowFilmN() throws SQLException {
		
		Connection con= ConnectionPool.getConnection();
		PreparedStatement pstmt= null;	
		ResultSet rs = null;
		int showFilm = 0;
		pstmt = con.prepareStatement(SHOW_FILM_N);
					
		rs = pstmt.executeQuery();
		while(rs.next()){
		showFilm = rs.getInt("countFilm");
		}	
		return showFilm;
		
	}
	
	public static int ShowUserN() throws SQLException {
		
		Connection con= ConnectionPool.getConnection();
		PreparedStatement pstmt= null;	
		ResultSet rs= null;
		int showUser = 0;
		pstmt = con.prepareStatement(SHOW_USER_N);
					
		rs= pstmt.executeQuery();
		while(rs.next()){
					
	   showUser = rs.getInt("countUser");
		
	}
		return showUser;
		
	}
		
		
		
	



	
	
	private static final String SHOW_USER_N= "SELECT COUNT(*) as countUser FROM Utente";
	private static final String SHOW_FILM_N= "SELECT COUNT(*) as countFilm FROM Film";
	private static final String SHOW_REVIEWS_N="SELECT COUNT(*) as countReview FROM Recensione";
}