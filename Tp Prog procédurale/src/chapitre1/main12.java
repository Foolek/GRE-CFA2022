package chapitre1;
import java.util.*;

public class main12 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        double prix;
        double tva;
        double articles;
        double montantTTC;

        System.out.println("Saisissez un prix unitaire HT");
        prix = input.nextDouble();
        // prix = x

        System.out.println("Saisissez un taux de TVA");
        tva = input.nextDouble();

        System.out.println("Saisissez le nombre d'articles");
        articles = input.nextDouble();


        montantTTC = (prix + prix * tva / 100) * articles ;

        System.out.println("le total est de: " + montantTTC);


    }
}
