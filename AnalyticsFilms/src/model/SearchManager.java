 package model;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import bean.Film;
import bean.Cinema;
import bean.Recensione;
import connectionPool.ConnectionPool;



public class SearchManager {
	

  
    /* recupera un film a partire dal suo TitoloFilm*/
    
     
    public static Film searchByTitolo(String TitoloFilm) throws SQLException
    {
    	Film film = new Film();
        Connection con = null;
        PreparedStatement pstmt = null;
        con = ConnectionPool.getConnection();
       
        pstmt = con.prepareStatement(SEARCH_FILM_BY_TITOLO);
        pstmt.setString(1, TitoloFilm);
        ResultSet rs = pstmt.executeQuery();
        
          
        rs.close();
        pstmt.close();
        con.close();       
       
        return film;
           
    }
  
    
    private static final String SEARCH_FILM_BY_TITOLO = "SELECT * FROM Film WHERE TitoloFilm = ?";
    
    

}
