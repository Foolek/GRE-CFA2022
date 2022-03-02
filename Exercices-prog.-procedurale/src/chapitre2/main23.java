package chapitre2;
import java.util.*;

public class main23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bool = true;
        boolean nobool = false;

        double a, b, c;

        System.out.println("Un commerçant accorde une remise de 5 % pour tout achat d’un montant compris entre 100 et \n" +
                "500 € et 8 % au-delà. Calcul du montant de la remise sur un achat donné.\n");

        System.out.print("Prix total de votre achat : ");
        a = input.nextInt();

        if (a > 0 && a < 100) {
            System.out.print("Vous n'avez droit à aucune remise, le montant total sera toujours de " + a + "€");
        } else if (a >= 100 && a <= 500){
            a = a - (a * 5 /100);
            System.out.print("Vous avez droit à 5% de remise, le montant total à payer sera de :" + a +"€");
        } else if (a > 500){
            a = a - (a * 8 /100);
            System.out.print("Vous avez droit à 8% de remise, le montant total à payer sera de :" + a + "€");
        }
    }
}
