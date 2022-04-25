package TD1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] table = { 2, 6, 5, 9, 8,10, 54, 21, 55 };

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Saisissez une valeur pour afficher une case de tableau de 8 case");

            int saisie = sc.nextInt();
            try {
                System.out.println(table[saisie]);
            }
            catch (Exception e){
                System.out.println("Out of range");
            }
        }



    }
}
