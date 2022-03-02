package chapitre3;
import java.util.*;

public class main313 {
    public static void main(String[]args){

        String saisie;
        String test = "";
        int i, taille;

        Scanner input = new Scanner(System.in);

        System.out.println("Entrez votre nom et prénom(s)");
        saisie = input.nextLine();

        taille = saisie.length();


        for( i = 0; i < taille; i++){
            if(Character.isUpperCase(saisie.charAt(i))){
                test = test + saisie.charAt(i);
            }
        }

        System.out.println(test);


    }
}
