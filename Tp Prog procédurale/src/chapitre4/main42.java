package chapitre4;
import java.util.*;

public class main42 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        char[] tableau = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String test = "";
        String test2;

        System.out.println("Entrez une lettre à chercher dans le tableau:");
        test2 = sc.next().substring(0).toLowerCase();


        for(int i = 0; i < tableau.length; i++){
            test = test + tableau[i];
        }
        if(test.contains(test2)){
            System.out.println("La lettre " + test2 + " existe dans le tableau");
        }else{
            System.out.println("La lettre " + test2 + " n'existe pas dans le tableau");
        }
    }
}
