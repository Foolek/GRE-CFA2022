package chapitre4;
import java.util.*;

public class main46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] entier = new int[5];


        for(int i = 0; i < entier.length; i++ ){ // saisie de données
            System.out.println("Entrez une valeur: ");
            int entree = sc.nextInt();
            entier[i] = entree;
        }

        System.out.println("Voici les éléments contenus dans le tableau:");

        for(int i = 0; i < entier.length; i++){
            System.out.println(entier[i]);
        }

        int valmax = 0;
        for(int i = 0; i < 5; i++){
            if(valmax < entier[0]){
                valmax = entier[i];
            }
            entier[0]++;
        }

        System.out.println("La valeur max de ce tableau est " + valmax);





    }
}
