package chapitre3;
import java.util.*;

public class main34 {

    public static void main(String[]args){

        int i = 1;

        while(i < 20){
            if(i % 2 == 0){
                System.out.println( i + " est un nombre pair.");
            }
            if(i % 2 == 1){
                System.out.println( i + " est un nombre impair." );
            }
            i++;
        }

    }
}
