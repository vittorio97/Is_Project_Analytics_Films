package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.Film;
import connectionPool.ConnectionPool;

public class FilmManager {
	public static boolean AddFilm(Film film) throws SQLException

	{
		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		boolean registrator = false;

		try{
			pstmt = con.prepareStatement(ADD_FILM);

			pstmt.setString(1, film.getTitoloFilm());
			pstmt.setString(2, film.getTrama());
			pstmt.setString(3, film.getLocandina());
			pstmt.setString(4, film.getCategoria());
			pstmt.setString(5, film.getUs().getEmail());

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



	public static boolean ModifyFilm(Film film) throws SQLException
	{
		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		boolean registrator = false;
		try{
			
			pstmt = con.prepareStatement(MODIFY_FILM);
			
			
	
			pstmt.setString(4, film.getTitoloFilm());
				
			pstmt.setString(1, film.getTrama());		
			pstmt.setString(3, film.getLocandina());
			pstmt.setString(2, film.getCategoria());


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



	/**
      Rimuove un film dall'elenco

	 */
	public static boolean DeleteFilm(String TitoloFilm) throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		boolean registrator = false;
		try{
			pstmt = con.prepareStatement(DELETE_FILM);
			
			pstmt.setString(1, TitoloFilm);
			
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



	/**
      Mostra elenco di tutti i film

	 */
	public static Collection <Film> ShowFilmList() throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		Collection <Film> film=new ArrayList<Film>();



		pstmt = con.prepareStatement(SHOW_FILMS);

		rs= pstmt.executeQuery();

		while(rs.next()){
			String titoloFilm = rs.getString("TitoloFilm");
			String trama= rs.getString("Trama");
			String locandina=rs.getString("Locandina");
			String categoria=rs.getString("Categoria");


			film.add(new Film(titoloFilm,trama,locandina,categoria));

		}

		return film;
	}
	public static Film ShowFilm(String Titolo) throws SQLException{

		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		Film film = null;

		pstmt = con.prepareStatement(SHOW_FILM);
		pstmt.setString(1, Titolo);
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
	
	

	




	private static final String SHOW_FILM= "SELECT * FROM Film WHERE TioloFilm= ?";
	private static final String SHOW_FILMS = "SELECT * FROM Film";
	private static final String ADD_FILM ="INSERT INTO Film(TitoloFilm,Trama,Locandina,Categoria,Email) VALUES (?,?,?,?,?)";
	private static final String MODIFY_FILM= "UPDATE Film SET  Trama= ?, Categoria = ?, Locandina=?  WHERE TitoloFilm = ?";
	private static final String DELETE_FILM = "DELETE FROM Film where TitoloFilm = ?";

}


