package bean;

import java.sql.Time;

public class Cinema {
	public Cinema(String nome, String luogo, Time orario){
		this.nome=nome;
		this.luogo=luogo;
		this.orario=orario;
		
	}
	

/* metodi get e set*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public Time getOrario() {
		return orario;
	}
	public void setOrario(Time orario) {
		this.orario = orario;
	}
	
	
	private String nome, luogo;
	private Time orario;
}
