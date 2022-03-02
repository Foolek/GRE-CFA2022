package chapitre2;
import java.util.*;

public class main26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int  total = 0;
        int a;

        while(true){

            System.out.print("Ajoutez une valeur:");
            a = input.nextInt();

            total = total + a;

            if(a == 0){
                System.out.println("Le total des entiers est de " + total);
                break;
            };

        }
    }
}
