package TD3.enfant.Animaux;

import TD3.enfant.Animal;

public class Mamifere extends Animal {

    private int dureeSevrage;

    public Mamifere(String nom, String couleur, String cri, int duree){
        super(nom, couleur, cri);
        this.nom = nom;
        this.couleur = couleur;
        this.cri = cri;
        dureeSevrage = duree;
    }

    @Override
    public void affiche() {
        System.out.println("\nType de l'animal : Mamifère " +
                "\nNom : " + nom +
                "\nCouleur : " + couleur +
                "\nCri : " + cri +
                "\nDurée de sevrage en mois : " + dureeSevrage + "mois\n");
    }
}
