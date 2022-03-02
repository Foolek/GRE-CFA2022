package TD2;

import java.util.Scanner;

public class calculatrice {
    private Scanner sc = new Scanner(System.in);
    String saisie = "Saisissez 2 nombres réels, entiers, séparés par la touche 'entrer'";


    calculatrice(){

        System.out.println("Choisissez le type d'opération (  +  -  *  /  ) ou 'exit' pour quitter");
        String operator = "";

        operator = sc.next();

        switch (operator) {
            case "+":
                addition();
                break;
            case "-":
                soutraction();
                break;
            case "*":
                multiplication();
                break;
            case "/":
                division();
                break;
            case "exit":
                System.out.println("Fermture du programme");
                System.exit(0);
            default:
                System.out.println("Erreur, ce type d'opération n'existe pas.");
                break;
        }
    }

    public void addition(){
        System.out.println(saisie);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Total: " + (a+b));
    }

    public void soutraction(){
        System.out.println(saisie);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Total: " + (a - b));
    }

    public void multiplication(){
        System.out.println(saisie);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Total: " + (a*b));
    }

    public void division(){
        System.out.println(saisie);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Total: " + (a/b));
    }
}
