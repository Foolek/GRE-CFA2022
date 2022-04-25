package chapitre3;
import java.util.*;

public class main38 {
    public static void main(String[]args){

        int a = 10;

        while(a <=20){
            System.out.println(a);
            a++;
            switch(a){
                case 13:
                    a++;
                    continue;
            }
        }

    }
}
