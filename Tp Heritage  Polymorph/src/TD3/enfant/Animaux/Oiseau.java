package TD3.enfant.Animaux;

import TD3.enfant.Animal;

public class Oiseau extends Animal {

    private float longueur_ailes;

    public Oiseau(String nom, String couleur, String cri, float ailes){
        super(nom, couleur, cri);
        this.nom = nom;
        this.couleur = couleur;
        this.cri = cri;
        this.longueur_ailes = ailes;
    }


    @Override
    public void affiche() {
        System.out.println("\nType de l'animal : Mamifère " +
                "\nNom : " + nom +
                "\nCouleur : " + couleur +
                "\nCri : " + cri +
                "\nLongueur des ailes : " + longueur_ailes + "cm\n");
    }
}
