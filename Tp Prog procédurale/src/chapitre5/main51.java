package chapitre5;

import java.util.*;

public class main51 {


    public static void main(String[] args) {
        System.out.println("écrire la fonction min");
        int[] T = {9,4,2,12,42};
        int minTab = 0;
        minTab = min(T,5); // appel de la method min avec parametre qui est juste en haut et 5 comme paramètre
        System.out.println("la val min est : " + minTab);
    }

    static int min( int tableau[], int taille) {
        // int tableau[] sera égal au tableau appelé dans main,
        // int taille aura pour valeur celle qu'on aura déclaré en paramètre lors de l'appel de la fonction

        int valMin = tableau[0];
        for(int i = 0; i<taille; i++){
            if(tableau[i] < valMin){ // si min est supérieur à tableau[i]
                valMin = tableau[i]; // alors min = à la valeur de tableau[i]
            }
        }
        return valMin; // renvoie la valeur mini
    }

}
