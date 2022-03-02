package chapitre5;

import java.util.*;

public class main55 {

    public static void main(String[] args) {
        int t1 = 125;
        int t2 = 5;
        System.out.print("Maximum " + max(t1, cube(t2)));
    }

    static int cube(int a){
        int total = a * a;
        return total;
    }

    static int max(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

}
