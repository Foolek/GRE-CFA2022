package chapitre2;
import java.util.*;

public class main25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Saisissez trois nombres entiers, ils seront triés dans l'ordre croissant");

        System.out.print("Saisissez la valeur A: ");
        a = input.nextInt();

        System.out.print("Saisissez la valeur B: ");
        b = input.nextInt();

        System.out.print("Saisissez la valeur C: ");
        c = input.nextInt();


        if(a >= b && a >= c && b >= c){ // c b a
            System.out.print( "c:" +  c + " <= b:" + b + "<=  a:" + a);
        }else if (a <= b && a >= c && b >= c){ // c a b
            System.out.print("c:"+c + "<= a:"+ a + "<= b:"+ b);
        }else if (a >= b && a >= c && c >= b){ // b c a
            System.out.print( "b:" + b + "<= c:"+ c + "<= a:" + a);
        }else if (a >= b && a <= c && c >= b){ // b a c
            System.out.print("b:"+ b + "<= a:" + a + "<= c:" + c);
        }else if (a <= b && a <= c && b >= c){ // a c b
            System.out.print("a:"+a + "<= c:" + c + "<= b:"+b);
        }else if (a < b && a < c && b < c){
            System.out.print("a:"+a + "<= b:" + b + "<= c:" +c);
        }
    }
}
