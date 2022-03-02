package chapitre4;
import java.util.*;

public class main41 {
    public static void main(String[]args){
        String texte = new String();
        String recherche = "e";
        String test = new String();
        String test2;
        int a, scLgt;
        int b = 0;

        System.out.println("Ecrivez une phrase:");
        Scanner sc = new Scanner(System.in);
        texte = sc.nextLine();

        scLgt = texte.length();

        for(a = 0; a < scLgt; a++){
            if(texte.charAt(a) == 'e' ){
                b++;
            }

        }
        System.out.print("Il y a " + b + " 'e' dans votre phrase.");
    }
}

