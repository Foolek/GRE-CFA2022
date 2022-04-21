package entities;

import java.io.Serializable;

public class Ville implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nom;

	public Ville(){
		this.nom = "";
	}

	public Ville(String nom){
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
