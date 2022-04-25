package chapitre1;
import java.util.Scanner;

public class main13 {

    public static void main(String[]args){

        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur le programme d'échange de valeur");
        System.out.println("Entrez votre valeur a:");
        a = input.nextInt();

        System.out.println("Entre votre valeur b;");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Votre valeur a est: ' " + a + " ' et la valeur b est: ' " + b + " '");

    }
}
