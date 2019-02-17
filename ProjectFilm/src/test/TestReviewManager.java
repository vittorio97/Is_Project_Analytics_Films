package test;

import java.sql.SQLException;

import bean.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import model.*;

public class TestReviewManager extends TestCase {

		private ReviewManager manager;
		
		
		
		public TestReviewManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager = new ReviewManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testInsertReview() throws SQLException {
			
			Recensione recensione = null;
			assertNull(recensione);
					
						
			
			recensione = new Recensione();
			recensione.setTitolo("Bellino");
			recensione.setTesto("carino o forse no");
			assertNotNull(recensione);
				
			
		}
		
		
		

		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestReviewManager("testInsertReview"));
			
			return suite;
		}

}