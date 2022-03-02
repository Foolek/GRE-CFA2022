package chapitre3;
import java.util.*;

public class main37 {
    public static void main(String[]args) {

        // Saisir une valeur entière pour afficher la table de multiplication correspondante

        Scanner input = new Scanner(System.in);
        int i;
        int b;
        String exit = "";


        do{
            System.out.println("Entrez une valeur pour afficher sa table de multiplication jusqu'à 10");
            i = input.nextInt();

            for (b = 0; b < 10; b++){
                System.out.println(i + " x " + b + " = " + i * b);
            }

            System.out.println("Continuer ? o/n");
            exit = input.next();

        }while(exit.equals("o") || exit.equals("O"));
    }
}

