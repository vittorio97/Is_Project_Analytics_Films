package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.*;
import connectionPool.ConnectionPool;

public class SearchManager {
	

     
     
    public static Film searchByTitolo(String TitoloFilm) throws SQLException
    {
    	Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		Film film = null;

		pstmt = con.prepareStatement(SEARCH_FILM_BY_TITOLO);
		
		pstmt.setString(1,TitoloFilm);
		
		rs= pstmt.executeQuery();
		
		

		while(rs.next()){
			String titoloFilm = rs.getString("TitoloFilm");
			String trama= rs.getString("Trama");
			String locandina=rs.getString("Locandina");
			String categoria=rs.getString("Categoria");

			film = new Film(titoloFilm,trama,locandina,categoria);
			
			
		}

	{
			try {
				if (pstmt != null)
					pstmt.close();
			} finally {
				ConnectionPool.releaseConnection(con);
			}
		}
		
		return film;
	}
	
	
       
        
           
    
    
    
    public static  Collection <Cinema> searchCinema(String TitoloFilm) throws SQLException
   
    {
    	Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		
		Collection <Cinema> cinema= new ArrayList<Cinema>();
		
		

	pstmt = con.prepareStatement(SEARCH_CINEMA_BY_TITOLOFILM);
	
	pstmt.setString(1, TitoloFilm);
	rs= pstmt.executeQuery();
	
	
	while(rs.next()){
		
		
		Cinema c = new Cinema();
		
		c.setNome(rs.getString("Nome"));
		c.setLuogo(rs.getString("Luogo"));
		c.setOrario(rs.getTime("Orario"));
		
		
		System.out.println(c.getNome());
		cinema.add(c);

		
	}
	  
	return cinema;
    }
  	
  
    
    private static final String SEARCH_FILM_BY_TITOLO = "SELECT * FROM Film WHERE TitoloFilm= ?";
    private static final String SEARCH_CINEMA_BY_TITOLOFILM = "SELECT * FROM CINEMA_FILM INNER JOIN CINEMA on CINEMA_FILM.Nome=CINEMA.Nome WHERE TitoloFilm=?";

}
