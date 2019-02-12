package bean;

import java.io.Serializable;

public class Recensione implements Serializable{
	private static final long serialVersionUID = 1L;



public Recensione() {
	super();
}
	
	public Recensione(String titolo, String testo){
		
		this.titolo=titolo;
		this.testo=testo;
		
		
	}
/* metodi get e set*/
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	

	
	
	public Utente getU() {
		return u;
	}

	public void setU(Utente u) {
		this.u = u;
	}




	public Film getF() {
		return f;
	}

	public void setF(Film f) {
		this.f = f;
	}




	private String titolo,testo;
	private Utente u;
	private Film f;
	
}