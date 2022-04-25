package TD3.enfant;

public abstract class Animal {
    public String nom;
    public String couleur;
    public String cri;

    public Animal(String nom, String couleur, String cri){
        this.nom = "";
        this.couleur = "";
        this.cri = "";
    }

    abstract public void affiche();

}
