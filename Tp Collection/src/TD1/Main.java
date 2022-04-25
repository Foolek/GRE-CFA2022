package TD1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Arrays.sort(args);
        for(String test : args ){
            System.out.print(test +  " ");
        }
    }
}
