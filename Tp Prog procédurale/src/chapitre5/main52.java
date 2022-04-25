package chapitre5;

import java.util.*;

public class main52 {

  public static void main(String[] args) {
        System.out.println("Tri d'un tableau de taille quelconque");
        int[] table = {9,3,6,2,8,5,7,1,4};
        tri(table, 9);
        System.out.print(Arrays.toString(table));
    }


    static int[] tri(int[] tableau, int taille){

        int temp = 0; // variable pour la permutation
        for(int i = 0; i < taille; i++){ // pour i = 0; tant que i est inférieur a tableau.lenght, i = i + 1
            for(int j = 1; j < (taille -i); j++){ // pour j = 1; tant que j est inférieur à (tableau.lenght - 1); j = j + 1
                if(tableau[j-1] > tableau[j]){
                    temp = tableau[j-1];
                    tableau[j-1] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }
        return tableau;
    }
}
