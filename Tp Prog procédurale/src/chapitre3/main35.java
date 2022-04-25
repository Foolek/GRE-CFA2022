package chapitre3;
import java.util.*;

public class main35 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        // Ecrire un programme affichant une suite de nombres pairs dans une plage déterminée par
        //l’utilisateur. Ce dernier entre au clavier une borne basse, ainsi qu’une borne haute, et le programme
        //affiche dans un ordre croissant les nombres pairs compris dans ce domaine, sans inclure les bornes.

        int a;
        int b;
        int c;

        System.out.println("Affichage des nombres pairs entre deux nombres entiers et classement par ordre croissant");
        System.out.println("Veuillez entrer un premier nombre entier:");
        a = input.nextInt();
        System.out.println("Veuillez entrer un second nombre entier:");
        b = input.nextInt();

        if(a>b){
            c = a;
            a = b;
            b = c;
        }


        while(a <= b){
            if(a % 2 == 0){
                System.out.println( a + " est un nombre pair.");
            }
            a++;
        }

    }
}
