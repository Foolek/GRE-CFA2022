package chapitre1;
import java.util.*;

public class main16 {
    public static void main(String[]args){

        int heure, minute, seconde, total;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur le programme de conversion de secondes en heure !");

        System.out.println("Saissez le nombre de secondes :");
        total = input.nextInt();

        heure = total / 3600;
        minute = (total  / 60) % 60;
        seconde = total % 60;



        System.out.println("la conversion de la duree saisie est de " + heure + " heure " + minute + " minutes " + seconde + " secondes " );


    }
}
