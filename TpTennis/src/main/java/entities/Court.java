package entities;

import java.io.Serializable;

public class Court implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nom;

	public Court() {
		this.nom = "";
	}
	
	public Court(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString(){
		return this.getNom();
	}

}
