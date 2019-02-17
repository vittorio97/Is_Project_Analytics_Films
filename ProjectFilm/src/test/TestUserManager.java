package test;

import java.sql.SQLException;

import bean.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import model.*;

public class TestUserManager extends TestCase {

		private UserManager manager;
		
		
		
		public TestUserManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager = new UserManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testModifyInfo() throws SQLException {
			
			Utente utente = null;
			assertNull(utente);
			
			utente = new Utente ("Vittorio","vitt","dfg","utente registrato");
			assertNotNull(utente);
			
			
		}
		
		public void testDeleteAccount() throws SQLException{
			
			
	
			Utente utente = null;
			assertNull(utente);
			
			utente = new Utente ("Vittorio","vitt","dfg","utente registrato");
			assertNotNull(utente);
			
			
			
			
			
		}
		
		
		
			
	
		



		
		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestUserManager("testModifyInfo"));
			suite.addTest(new TestUserManager("testDeleteAccount"));
			return suite;
		}

}