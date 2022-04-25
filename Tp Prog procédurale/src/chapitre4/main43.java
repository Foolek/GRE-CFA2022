package chapitre4;
import java.util.*;

public class main43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String saisie;

        System.out.println("Saisissez du texte:");
        saisie = sc.nextLine();

        String remplacement = saisie.replace("e", "");

        System.out.println(remplacement);

    }
}
