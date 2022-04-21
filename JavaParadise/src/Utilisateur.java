public class Utilisateur {

	String nom, prenom, id, mdp;

	public Utilisateur() {
		this.nom = null;
		this.prenom = null;
		this.id = null;
		this.mdp = null;
	}

	public Utilisateur(String nom, String prenom, String id, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getId() {
		return id;
	}

	public String getMdp() {
		return mdp;
	}

	public void setNom(String name) {
		nom = name;
	}

	public void setPrenom(String firstname) {
		prenom = firstname;
	}

	public void setId(String newid) {
		id = newid;
	}

	public void setMdp(String newmdp) {
		mdp = newmdp;
	}

	public String toString() {
		return nom + " " + prenom + " [" + id + "]";
	}

}
