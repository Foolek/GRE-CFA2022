package chapitre5;

import java.util.*;

public class main56 {

    public static void main(String[] args) {

        int max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner un Maximum : \n");
        max = sc.nextInt();

        System.out.println("Voilà les nombres parfait : ");
        for (int j = 1; j <= max; j++) {
            if (estParfait(j)) {
                System.out.println(j);
            }

        }
    }


    public static boolean estParfait(int nombre) {
        // Somme des facteurs du nombre.
        int somme = 0;

        // Déterminer les facteurs du nombre.
        for (int i = 1; i <= nombre / 2; i++)
            if (nombre % i == 0)
                somme += i;

        return (nombre == somme);
    }


}
