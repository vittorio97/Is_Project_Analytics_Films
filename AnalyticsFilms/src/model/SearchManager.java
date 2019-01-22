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
	

    /**
     * recupera un film a partire dal suo TitoloFilm
     * @param TitoloFilm: TitoloFilm del film da recuperare
     * @return Film: {@link Film}
     * @throws SQLException
     */
    public static Film searchByTitolo(String TitoloFilm) throws SQLException
    {
        String sql = "SELECT * FROM prodotto WHERE TitoloFilm = ?";
        Connection con = null;
        PreparedStatement pstmt = null;
        con = ConnectionPool.getConnection();
       
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, TitoloFilm);
        ResultSet rs = pstmt.executeQuery();
        
       
        Film film = converti(rs);
        
        rs.close();
        pstmt.close();
        con.close();       
       
        return film;
           
    }
      
    /**
     * Effettua la ricerca dei prodotti.
     * @param query: query di ricerca immessa dall'utente
     * @return ArrayList<Prodotto>: una lista di prodotti
     * @throws SQLException
     * @author Vittorio
     */
    public static ArrayList<Prodotto> search(String query) throws SQLException{
       
        Connection con = null;
        PreparedStatement pstmt = null;
        con = DBConnection.getConnection();
       
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
    private static final String DO_UPDATE= "UPDATE Prodotto SET Nome = ?, Produttore = ?, Piattaforma= ? , Genere= ? , Descrizione= ? , Immagini= ?, Prezzo= ? , Disponibilita= ?, DataUscita= ?, numVenduti= ?, linkVideo= ? WHERE idProdotto = ?";
    private static final String RICERCA_DA_MENU_CONSOLE = "SELECT * FROM Prodotto WHERE Disponibilita>=0 AND (Nome LIKE ? OR Nome LIKE ? OR Nome LIKE ?"
            + "AND Genere = ?)";
    private static final String RICERCA_DA_MENU_NAV = "SELECT * FROM Prodotto WHERE Disponibilita>=0 AND (Produttore LIKE ? OR Produttore LIKE ? OR Produttore LIKE ?"
            + "OR Piattaforma LIKE ? OR Piattaforma = ? )";
    private static final String RICERCA_DA_MENU_GIOCHI = "SELECT * FROM Prodotto WHERE Disponibilita>=0 AND (Piattaforma LIKE ? OR Piattaforma LIKE ? OR Piattaforma LIKE ?)";
    private static final String PIU_VENDUTI = "SELECT * FROM Prodotto WHERE Disponibilita>=0 ORDER BY numVenduti DESC LIMIT 0,5";
    private static final String ULTIMI_ARRIVI = "SELECT * FROM Prodotto WHERE Disponibilita>=0 ORDER BY DataUscita DESC LIMIT 0,5";
    private static final String DO_SAVE ="INSERT INTO Prodotto(Nome, Produttore, Piattaforma, Genere, Descrizione, Immagini, Prezzo, Disponibilita, DataUscita, numVenduti, linkVideo) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE_QUANTITY="UPDATE Prodotto SET Disponibilita = ?, numVenduti = ? WHERE idProdotto = ?";
    private static final String REMOVE_PRODUCT="UPDATE Prodotto SET Disponibilita = ? WHERE idProdotto = ?";
    private static final String RETRIVE_ALL = "SELECT * FROM prodotto p WHERE Disponibilita>=0";
}
