package chapitre1;
import java.util.*;

public class main17 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        float a, b, d;
        String c;

        System.out.println("Bienvenue sur le programme Calculatrice + * - / ");

        while(true){
            System.out.println("\n saisissez la valeur A:");
            a = input.nextFloat();

            System.out.println("saisissez un modulo + * - / %");
            c = input.next();

            System.out.println("saisissez la valeur B :");
            b = input.nextFloat();

            switch (c){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("Erreur dans la saisie de l'operateur\n");
            }
        }
    }
}
