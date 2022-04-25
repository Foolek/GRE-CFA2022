package chapitre3;
import java.util.*;

public class main33 {
    public static void main(String[]args){

        // en utilisant une seule variable i et une strucure itérative afficher les valeurs
        //impaires comprises entre 0 et 10

        int i = 0;

        while(i<10){
            i++;
            if(i % 2 == 1){
                System.out.print(i + ",");
            }
        }

    }
}
