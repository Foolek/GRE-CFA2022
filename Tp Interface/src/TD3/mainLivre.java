package TD3;

import TD3.enfant.bd;
import TD3.enfant.roman;

public class mainLivre {

    public static void main(String[]args){

        roman romanSansPam = new roman();
        romanSansPam.affiche();

        System.out.println("");

        roman romanAvecParam = new roman("Code 187", "Hérohachedeuxaif", 93 + 94, true);
        System.out.println("");

        bd bd1 = new bd("La place de la femme c'est à la kouizine", "saint branham", 48, "Anonyme");
        bd1.affiche();
    }
}