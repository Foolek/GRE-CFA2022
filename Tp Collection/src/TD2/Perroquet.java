package TD2;

public class Perroquet {

    String nom, couleur, cri;
    static int i = 1;

    public Perroquet(){
        nom ="";
        couleur="";
        cri="";
    }

    public Perroquet(String nom, String couleur, String cri) {
        this.nom = "Nom : " + nom;
        this.couleur = "Couleur : " + couleur;
        this.cri = "Cri : " + cri;
    }

    public void affiche(){
        System.out.println(i + " ->     " + nom + "     " + couleur + "     " + cri );
        i++;
    }
}
