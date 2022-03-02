package chapitre1;
import java.util.*;

public class main19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bool = true;
        boolean nobool = false;

        int a, b, c;
        b = 0;
        System.out.println("Saisissez un nombre afin de voir s'il est positif, négatif ou nul");
        a = input.nextInt();

        if(b > a){
            System.out.println("La valeur est négative: -1");
        }
        if(b == a){
            System.out.println("La valeur est nulle: 0");
        }
        if(b < a ){
            System.out.println("La valeur est positive: +1");
        }
    }
}
