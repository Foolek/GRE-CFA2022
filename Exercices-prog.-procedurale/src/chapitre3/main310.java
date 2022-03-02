package chapitre3;
import java.util.*;

public class main310 {
    public static void main(String[]args){

        //calculer le nombre de fois ou les caracteres 0 à 9 sont
        //utilisés pour numéroter les pages d'un livre de moins
        //de 10 000 pages

        Scanner input = new Scanner(System.in);

        int i = 0;
        int total = 0;

        System.out.println("Entrez le nombre de pages (< 10 000) :");

        i = input.nextInt();

        while(i>0){
            if(i>999){
                total += 4;
            }
            else if (i>99){
                total += 3;
            }
            else if (i>9){
                total += 2;
            }
            else{
                total += 1;
            }
            i--;
        }

        System.out.println("Le nombre de chiffres utilisés pour numéroter les pages est : " + total);





    }
}


