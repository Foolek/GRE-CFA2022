package chapitre1;
import java.util.*;

public class main14 {

    public static void main(String[]args){

        int x, y, z, a;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur le programme d'échange de valeur");
        System.out.println("Entrez votre valeur x:");
        x = input.nextInt();

        System.out.println("Entre votre valeur y:");
        y = input.nextInt();

        System.out.println("Entre votre valeur z:");
        z = input.nextInt();

        a = x;
        x = y;
        y = z;
        z = a;

        System.out.println("Votre valeur x est: ' " + x + " ' la valeur y est: ' " + y + " ' et la valeur z est: ' " + z + " '");

    }
}
