
package test;

import java.sql.SQLException;

import bean.Film;
import bean.Utente;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import model.*;

public class TestFilmManager extends TestCase {

		private FilmManager manager;
		
		
		
		public TestFilmManager(String name) {
			super(name);
		}
	
		
		protected void setUp() throws Exception {
			manager = new FilmManager();
		}
		
		
		protected void tearDown() throws Exception {
		}
	
	
	
		public void testAddFilm() throws SQLException {
			
			Film film = new Film();
			film.setTitoloFilm("a");
			assertFalse(FilmManager.AddFilm(film));
					
			film=new Film();
			film.setTitoloFilm("Il miglio verde");
			assertFalse(FilmManager.AddFilm(film));
			
			film=new Film();
			film.setTitoloFilm("Il miglio verde");
			film.setCategoria("Drammatico");
			assertFalse(FilmManager.AddFilm(film));
			
			film=new Film();
			film.setTitoloFilm("Il miglio verde");
			film.setCategoria("Drammatico");
			film.setTrama("Bel film");
			film.setLocandina("as");
			assertTrue(FilmManager.AddFilm(film));
			
			
		}
		
		
		public void testRemoveFilm() throws SQLException {
			
			Film film = null;
			assertNull(film);
			
			film = new Film ("Dunkirk","Bel film ricco di colpi di scena","locandina.jpg","Drammatico");
			assertNotNull(film);
		}
		
		public void testModifyFilm() throws SQLException {
			
	
		}



		
		public static Test suite() {
			TestSuite suite= new TestSuite();
			suite.addTest(new TestFilmManager("testRemoveFilm"));
			
			return suite;
		}

}