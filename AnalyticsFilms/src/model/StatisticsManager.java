package model;


	import java.sql.Connection;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import bean.Film;
	import bean.Utente;
	import bean.Recensione;
	
	import connectionPool.ConnectionPool;

	/**
	 * Classe il calcolo delle statistiche dal database
	 * @author Vittorio
	 */
	 
	
	public class StatisticsManager {

		
		public static boolean statistics() throws SQLException {
			
			Connection con = ConnectionPool.getConnection();
			PreparedStatement pstmt = null;		
			boolean registrator = false;
	
			
			//numero film in elenco 
			pstmt = con.prepareStatement(NUMBER_FILM);
			int rs = pstmt.executeQuery();
			
			
			int nProdottiVenduti = 0;
			if (rs.next())
				nProdottiVenduti = rs.getInt(1);
			
			//numero prodotti catalogo
			pstmt = con.prepareStatement(N_PRODOTTI_CATALOGO);
			rs = pstmt.executeQuery();
			
			int nProdottiCatalogo = 0;
			if (rs.next())
				nProdottiCatalogo = rs.getInt(1);
			
			//numero utenti registrati
			pstmt = con.prepareStatement(N_UTENTI_REGISTRATI);
			rs = pstmt.executeQuery();
			
			int nUtentiRegistrati = 0;
			if (rs.next()) 
				nUtentiRegistrati = rs.getInt(1);
			
			//ordini in media per utente
			int avgOrdiniUtente = 0;
			try {
				
				avgOrdiniUtente = nProdottiVenduti / nUtentiRegistrati;
				
			} catch (Exception e) {
				System.err.println("divisione per 0");
			}
			
			
		
			; 
			
			return stats;
		}

		
		private static final String NUMBER_FILM = "SELECT COUNT(*) FROM Film";
		private static final String NUMBER_USER = "SELECT COUNT(*) FROM Utente";
		private static final String NUMBER_REVIEW = "SELECT COUNT(*) FROM Recensioni";
	}
	
}
