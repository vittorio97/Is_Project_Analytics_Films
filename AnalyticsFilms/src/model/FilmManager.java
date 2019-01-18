package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Film;
import connectionPool.ConnectionPool;


public class FilmManager {
	
/**
 * Salva il prodotto nel database
 * @param film: {@link Film}
 * @throws SQLException
 */
public static void AddFilm(Film film) throws SQLException
{
	Connection con = ConnectionPool.getConnection();
	PreparedStatement pstmt = null;
    pstmt = con.prepareStatement(DO_SAVE);
   
    Date date = Date.valueOf(p.getDataUscita());

    pstmt.setString(1, p.getNome());
    pstmt.setString(2, p.getProduttore());
    pstmt.setString(3, p.getPiattaforma());
    pstmt.setString(4, p.getGenere());
    pstmt.setString(5, p.getDescrizione());
    pstmt.setString(6, p.getImmagine());
    pstmt.setFloat(7, p.getPrezzo());
    pstmt.setInt(8, p.getDisponibilita());
    pstmt.setDate(9, date);
    pstmt.setInt(10, 0);
    pstmt.setString(11, p.getLinkVideo());
   
    pstmt.executeUpdate();
   
    pstmt.close();
    con.close();  
}

	/**
     * Aggiorna i dati del prodotto
     * @param p: {@link Prodotto}
     * @throws SQLException
     */
    public static void doUpdate(Prodotto p) throws SQLException
    {
        Connection con = null;
        PreparedStatement pstmt = null;
        con = DBConnection.getConnection();
       
        pstmt = con.prepareStatement(DO_UPDATE);
       
        Date date = Date.valueOf(p.getDataUscita());
 
        pstmt.setString(1, p.getNome());
        pstmt.setString(2, p.getProduttore());
        pstmt.setString(3, p.getPiattaforma());
        pstmt.setString(4, p.getGenere());
        pstmt.setString(5, p.getDescrizione());
        pstmt.setString(6, p.getImmagine());
        pstmt.setFloat(7, p.getPrezzo());
        pstmt.setInt(8, p.getDisponibilita());
        pstmt.setDate(9, date);
        pstmt.setInt(10, 0);
        pstmt.setString(11, p.getLinkVideo());
        pstmt.setInt(12, p.getIdProdotto());
       
        pstmt.executeUpdate();
       
        pstmt.close();
        con.close();
    }
    /**
     * Rimuove un prodotto dal catalogo
     * @param idProd: id del prodotto da rimuovere
     * @throws SQLException
     */
    public static void removeProduct(int idProd) throws SQLException{
        Connection con = null;
        PreparedStatement pstmt = null;
        con = DBConnection.getConnection();
       
        pstmt = con.prepareStatement(REMOVE_PRODUCT);
        pstmt.setInt(1, -1); //setta la disponibilita a -1
        pstmt.setInt(2, idProd);
       
        pstmt.executeUpdate();
       
        pstmt.close();
        con.close();
       
    }
   
    //-------------------------------------------------------------------------------------
    //-- DCS
    //-------------------------------------------------------------------------------------
    
    /* (non-Javadoc) */
    private static Prodotto converti(ResultSet rs) throws SQLException
    {
        Prodotto p  = null;
        if(rs.next())
            p = new Prodotto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getFloat(8), rs.getInt(9), rs.getDate(10).toLocalDate(), rs.getString(12));
        return p;
    }
   
    /* (non-Javadoc) */
    private static ArrayList<Prodotto> convertiArray(ResultSet rs) throws SQLException
    {
        ArrayList<Prodotto> risultati = new ArrayList<Prodotto>();
       
        while(rs.next()) {
            Prodotto p = new Prodotto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getFloat(8), rs.getInt(9), rs.getDate(10).toLocalDate(), rs.getString(12));
            risultati.add(p);
        }
        return risultati;
    }
    //-------------------------------------------------------------------------------------
 
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
}