package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import bean.Film;
import bean.Cinema;
import bean.Recensione;
import connectionPool.ConnectionPool;

public class SearchManager {
	
	private static final String TABLE_NAME= "Film";
	private final int NUMERO_LIBRI=8;

	public Collection <Film> search (String titolo) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		Collection <Film> libri = new LinkedList<Film>();

		String selectSQL = "SELECT * FROM film WHERE titoloFilm = ?";


		try {
			connection = ConnectionPool.getConnection();
			preparedStatement = connection.prepareStatement(selectSQL);
			
			preparedStatement.getString(1
			preparedStatement.getString(2,
			preparedStatement.getString(3,
			
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Film bean = new Film();

				bean.setTitolo(rs.getString("TitoloFilm"));
				bean.setTtama(rs.getString("Trama"));
				bean.setLocandina(rs.getString("Locandina"));
				bean.setCategoria(rs.getString("Categoria"));
				
				
				
				
				films.add(bean);
			}

		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				DriverMaagerConnectionPool.releaseConnection(connection);
			}
		}
		return films;
	}
	