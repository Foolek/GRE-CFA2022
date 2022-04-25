package TD2;

import TD2.enfant.*;

public class main {
    public static void main(String[]args){

        System.out.println("Connecteur And");

        and and = new and(true, true);
        System.out.println(and.sortie());
        and = new and(true, false);
        System.out.println(and.sortie());

        System.out.println("Connecteur Or : ");


        or or = new or(false, false);
        System.out.println(or.sortie());
        or.set_entree1(true);
        System.out.println(or.sortie());
        or.set_entree2(true);
        System.out.println(or.sortie());

    }

}
