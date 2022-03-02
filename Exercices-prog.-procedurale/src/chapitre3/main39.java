package chapitre3;
import java.util.*;

public class main39 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("Entrez une valeur : ");
        a = input.nextInt();

        int i;

        for(i = a; i > 0; i--){
            for (int z = i; z > 0; z--){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}

