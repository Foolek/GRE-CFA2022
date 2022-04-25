package chapitre2;
import java.util.*;

public class main21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bool = true;
        boolean nobool = false;

        int a, b, c;

        System.out.println("Saisissez un nombre");
        a = input.nextInt();

        if(a % 2 == 1 ){
            System.out.println("Le nombre est impair");
        }
        if(a % 2 == 0){
            System.out.println("Le nombre est pair");
        }


    }
}
