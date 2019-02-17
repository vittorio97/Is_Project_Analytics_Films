package test;

import java.sql.SQLException;

import bean.Utente;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import model.*;

public class TestAuthenticationManager extends TestCase {

		private AuthenticationManager manager;
		
		
		
		public TestAuthenticationManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager= new AuthenticationManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testLogin() throws SQLException {
			
			Utente utente = manager.login("","");
			assertNull(utente);
			
		    utente = manager.login("ad@hotmail.it","");
			assertNull(utente);
			
			utente = manager.login("alina.aprea2@hotmail.it","a");
			assertNull(utente);
			
			utente = manager.login("alina.aprea2@hotmail.it","Unisa2");
			assertNotNull(utente);
			
			assertNotNull(utente.getEmail());
			assertNotNull(utente.getUsername());
			assertNotNull(utente.getRuolo());
			
		}
		
		
		
		public void testRegistration() throws SQLException {
			
			Utente utente = null;
			assertFalse(manager.add(utente));
			
			utente = new Utente();
			utente.setEmail("Vittorio@hotmail.it");
			assertFalse(manager.add(utente));
			
			utente = new Utente();
			utente.setEmail("Vittorio@hotmail.it");
			utente.setUsername("Vittorio97");
			assertFalse(manager.add(utente));
			
			utente = new Utente();
			utente.setEmail("Vittorio@hotmail.it");
			utente.setUsername("Vittorio97");
			utente.setPassword("Vittorio1");
			utente.setRuolo("Utente Registrato");
			assertTrue(manager.add(utente));
			
		}
	
		
		
		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestAuthenticationManager("testLogin"));
			suite.addTest(new TestAuthenticationManager("testRegistration"));
			return suite;
		}

}
