package test;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

import bean.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import model.SearchManager;

public class TestSearchManager extends TestCase {

		private SearchManager manager;
		
		
		
		public TestSearchManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager = new SearchManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testSearchFilm() throws SQLException {
			
			
			
					
			Film film = SearchManager.searchByTitolo("");
			assertNull(film);	
			
			film=SearchManager.searchByTitolo("Tremors");
			
			assertNotNull(film);
			
			assertNotNull(film.getTitoloFilm());
			assertNotNull(film.getTrama());
			assertNotNull(film.getLocandina());
			assertNotNull(film.getCategoria());
			
		
			
		}
		
		
		public void testSearchCinema() throws SQLException {
			
			
			
			
			Collection <Cinema> cinema;
			cinema= SearchManager.searchCinema("");
			assertTrue(cinema.size()==0);
			
			cinema=SearchManager.searchCinema("Tremors");
			assertTrue(cinema.size()>0);
			
			Iterator<Cinema> it=cinema.iterator();
			while(it.hasNext()){
				Cinema c=it.next();
				assertNotNull(c.getNome());
				assertNotNull(c.getLuogo());
				assertNotNull(c.getOrario());
			
		
			
			}
			
		}
		
			
	
		



		
		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestSearchManager("testSearchFilm"));
			suite.addTest(new TestSearchManager("testSearchCinema"));
			
			return suite;
		}

}