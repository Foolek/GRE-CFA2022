package chapitre3;
import java.util.*;

public class main32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.print("Saisissez une valeur entière:");
        a = input.nextInt();

        System.out.print("La somme des carrés d'entiers compris entre 1 et "+a+" vaut ");

        while( a != 0) {
            b = b + a * a;
            a--;
        }
        System.out.println(b+".");


    }
}
