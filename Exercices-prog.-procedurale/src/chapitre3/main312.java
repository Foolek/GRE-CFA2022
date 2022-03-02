package chapitre3;
import java.util.*;

public class main312 {
    public static void main(String[] args) {

        String str = "";
        String strReverse = "";
        int valReverse = 0;
        int valTemp = 0;

        for(int i = 0; i < 11; i++ ){
            valTemp = i*i;
            for(int a = valTemp; a > 0; a += 0){
                strReverse = strReverse + (a%10);
                a = a /10;
                Integer.valueOf(strReverse);
                if(i*i == a){
                    valReverse++;
                }
                System.out.println(valReverse);
            }
        }

    }
}

