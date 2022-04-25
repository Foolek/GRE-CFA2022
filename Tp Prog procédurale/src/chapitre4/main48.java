package chapitre4;
import java.util.*;

public class main48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pairs = new int[10];
        int[] impairs = new int[10];


        for( int i = 0; i < 10; i++){

            System.out.print("Saisissez un entier");
            int[] temp= new int[10];
            temp[i] = sc.nextInt();

            if(temp[i] % 2 == 0){
                pairs[i] = temp[i];
            }else if(temp[i] % 2 == 1) {
                impairs[i] = temp[i];
            }

        }

        System.out.println("la saisie " + Arrays.toString(pairs) + " sont des chiffres pairs");
        System.out.println("la saisie " + Arrays.toString(impairs) + "sont des chiffres impairs");

    }
}
