package test;

import java.sql.SQLException;

import bean.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import model.*;

public class TestStatisticsManager extends TestCase {

		private StatisticsManager manager;
		
		
		
		public TestStatisticsManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager = new StatisticsManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testShowStatistics() throws SQLException {
			
			Film film = null;
			Recensione recensione = null;
			Utente utente = null;
			assertNull(film);
			assertNull(recensione);
			assertNull(utente);
			


			
			
			film = new Film("Piccolo Principe","La famosa storia del piccolo principe","locandina.jpg","Fantastico");
			recensione = new Recensione("Bello","Pieno di magia");
			utente = new Utente("Venezia@gmail.com","Venezia1","Roma","Utente");
			
					
			assertNotNull(film);
			assertNotNull(recensione);
			assertNotNull(utente);
			
		}
		
		
		
			
	
		



		
		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestStatisticsManager("testShowStatistics"));
			
			return suite;
		}

}