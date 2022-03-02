package chapitre1;
import java.util.*;

public class main15 {
    public static void main(String[]args){

        int heure, minute, seconde, total;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur le programme de de durée H/M/S en secondes !");

        System.out.println("Saissez le nombre d'heures :");
        heure = input.nextInt();

        System.out.println("Saissez le nombre de minutes :");
        minute = input.nextInt();

        System.out.println("Saissez le nombre de secondes :");
        seconde = input.nextInt();

        heure = heure * 3600;
        minute = minute * 60;
        seconde = seconde * 1;

        total = heure + minute + seconde;

        System.out.println("la conversion de la duree saisie est de " + total + " secondes");


    }
}
