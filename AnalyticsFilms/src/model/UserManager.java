package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Utente;

public class UserManager {
	/**
	 * Recupera un utente a partire dal suo id
	 * @param email: id dell'utente
	 * @return {@link Utente}
	 * @throws SQLException
	 */
	public static Utente doRetrieveByKey(String email) throws SQLException {
		
		String sql = "SELECT * FROM utente WHERE Email = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		con = DBConnection.getConnection();

		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, email);
		
		ResultSet rs = pstmt.executeQuery();
		Utente utente = converti(rs);
		
		rs.close();
		pstmt.close();
		con.close();
		
		return utente;
	}
	/**
	 * Cancella l'utente in base all'email
	 * @param email: email dell'utente da cancellare
	 * @throws SQLException
	 */
	public static void doDeleteUser(String email) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		con = DBConnection.getConnection();

		pstmt = con.prepareStatement(DELETE_USER);
		pstmt.setString(1, email);
	

		pstmt.executeUpdate();

		pstmt.close();
		con.close();
	}
	private static final String UPDATE_PASSWORD = "UPDATE Utente SET Password = ? WHERE Email = ?";
	private static final String UPDATE_EMAIL = "UPDATE Utente SET Email = ? WHERE Email = ?";
	private static final String CHECK_EMAIL = "SELECT * FROM Utente WHERE Email = ?";
	private static final String UPDATE_ADDRESS = "UPDATE Utente SET Via = ?, Civico = ?, Cap = ?, Citta = ? WHERE Email = ?";
	private static final String CHECK_USER = "SELECT * FROM Utente WHERE Email = ? AND Password = ?";
	private static final String DELETE_USER= "DELETE FROM Utente WHERE Email = ?";
}
	
	//TODO: fare update ruolo
	
	//-- query
	private static final String UPDATE_EMAIL = "UPDATE amministratore SET Email = ? WHERE Email = ?";
	private static final String CHECK_ADMIN = "SELECT * FROM amministratore WHERE Email = ?";
	private static final String GET_UTENTE = "SELECT * FROM utente WHERE Email = ? AND Password = ?";
	private static final String DELETE_ADMIN= "DELETE FROM amministratore WHERE Email = ?";

}
