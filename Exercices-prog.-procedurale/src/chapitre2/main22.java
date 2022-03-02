package chapitre2;
import java.util.*;

public class main22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bool = true;
        boolean nobool = false;

        double a, b, x, total;

        System.out.println("Résolution de l'équation : a * x + b = 0");

        System.out.print("Saisir valeur de A : ");
        a = input.nextInt();

        System.out.print("Saisir valeur de B : ");
        b = input.nextInt();


        if (a != 0) {
            total = -b / a;
            System.out.printf("Le résultat est :" + total);
        }

    }
}
