package chapitre4;
import java.util.*;

public class main47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez la taille de votre tableau");
        int saisie = sc.nextInt();
        int[] entier = new int[saisie];


        for(int i = 0; i < entier.length; i++ ){ // saisie de données
            System.out.print("Entrez une valeur: ");
            int entree = sc.nextInt();
            entier[i] = entree;
        }

        System.out.println("Voici les éléments contenus dans le tableau:");

        for(int i = 0; i < entier.length; i++){
            String test = "";
            test = test + entier[i] + " . ";
            System.out.print(test);
        }

        int valmax = 0;
        for(int i = 0; i < saisie; i++){
            if(valmax < entier[0]){
                valmax = entier[i];
            }
            entier[0]++;
        }

        System.out.println("La valeur max de ce tableau est " + valmax);





    }
}
