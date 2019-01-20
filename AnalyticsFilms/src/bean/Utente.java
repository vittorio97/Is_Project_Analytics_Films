package bean;

import java.io.Serializable;

import java.sql.Date;
import java.sql.SQLException;

import model.AuthenticationManager;

public class Utente implements Serializable{
	private static final long serialVersionUID = 1L;



public Utente() {
	super();
}

	
	public Utente(String email, String username, String password, String ruolo){
		super();
		this.email= email;
		this.username = username;
		this.password = password;
		this.ruolo=ruolo;
	}
	
	/* metodi get e set*/
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	

	



	private String email,username,password,ruolo;
	
}
