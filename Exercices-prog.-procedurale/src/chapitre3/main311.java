package chapitre3;
import java.util.*;

public class main311 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        String strSaisie = new String().toLowerCase();
        String strReverse = new String().toLowerCase();


        System.out.println("Entrez un mot pour savoir s'il est palindrome !");
        strSaisie = input.next();

        for(int i = 0; i < strSaisie.length(); i++){ // pour chaque caractère dans strSaisie, i = i+1
            strReverse = strReverse + strSaisie.charAt(strSaisie.length() - i - 1); // charAt -> commence à une position spécifiée qui est -> strSaisie.length - i - 1 (-1 = derniere position)

            // j'effectue plusieurs tests avec:
            // System.out.print(strReverse.compareTo(strSaisie));
            // voir si la valeur finale à la comparaison est 0.

        }

        if(strReverse.compareTo(strSaisie) == 0 ){
            System.out.println("Palindrome");
        }else{
            System.out.println("n'est pas un palindrome");
        }

        while(true){
            System.out.print("Voulez vous continuer ? oui/non  ");
            strSaisie = input.next();
            switch (strSaisie){
                case "oui":
                    main(null);
                    break;
                case "non":
                    System.out.print("Merci d'avoir utilisé le programme PALINDROME");
                    System.exit(0);
                    break;
            }
        }
    }
}
