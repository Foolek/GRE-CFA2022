package TD1;

import java.util.Scanner;

public class mainCalculatrice {


    public static void main(String[]args){


        Scanner input = new Scanner(System.in);
        float a = 0.0F;
        float b = 0.0F;


        String c;

        System.out.println("Bienvenue sur le programme Calculatrice + * - / ");

        while(true){
            System.out.print("\nEntrez une valeur numérique 'A' : ");
            a = input.nextFloat();

            System.out.print("Entrez une valeur numérique 'B' : ");
            b = input.nextFloat();

            System.out.print("Choisissez une opération à effectuer entre  +  *  -  / : ");
            c = input.next();

            Calculatrice calc = new Calculatrice(a,b);

            switch (c){
                case "+":
                    System.out.println(calc.addition());
                    break;
                case "-":
                    System.out.println(calc.soustraction());
                    break;
                case "*":
                    System.out.println(calc.multiplication());
                    break;
                case "/":
                    System.out.println(calc.division());
                    break;
                default:
                    System.out.println("Erreur dans la saisie de l'operateur\n");
            }
        }
    }

}
