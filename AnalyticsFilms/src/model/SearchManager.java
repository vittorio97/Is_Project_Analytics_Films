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
      
   
    public static Collection <Film> search() throws SQLException{
       
        Connection con = null;
        PreparedStatement pstmt = null;
        con = ConnectionPool.getConnection();
       
        pstmt = con.prepareStatement(RETRIVE_ALL);
       
        //retrive products
        //-------------------------------------------------------------------------
        ResultSet rs = pstmt.executeQuery();
      
        List<Findable> list = new ArrayList<>();
       
        try {
            while (rs.next()) {
                Prodotto p = new Prodotto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getFloat(8), rs.getInt(9), rs.getDate(10).toLocalDate(), rs.getString(12));
                list.add(p);
            }
 
        } catch (Exception e) {
            IO.err("ERROR", e.getMessage());
            e.printStackTrace();
        }
        //-------------------------------------------------------------------------
       
        //search
        //-------------------------------------------------------------------------
        SearchEngine se = SearchEngine.getInstance();
       
        System.out.println("searching...");
       
        List<Findable> risultati = se.search(query, list);
        //-------------------------------------------------------------------------
       
        pstmt.close();
        con.close();       
       
        ArrayList<Prodotto> prodotti = new ArrayList<>();
        risultati.forEach((f) -> prodotti.add((Prodotto) f));
       
        return prodotti;
    }
    
    private static final String SEARCH_FILM_BY_TITOLO = "SELECT * FROM Film WHERE TitoloFilm = ?";
    private static final String GET_FILM= "SELECT * FROM Film";
    

}
