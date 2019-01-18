package bean;

import java.sql.Date;
import java.io.Serializable;


public class Recensione implements Serializable{
	private static final long serialVersionUID = 1L;



public Recensione() {
	super();
}
	
	public Recensione(String titolo, String testo, Date data){
		
		this.titolo=titolo;
		this.testo=testo;
		this.data=data;
		
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	private String titolo,testo;
	private Date data;
}
