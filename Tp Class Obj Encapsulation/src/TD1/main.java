package TD1;
import TD1.duree;

public class main {

    public static void main(String[] args) {



        System.out.println("*******************************************\n");


        System.out.print("Temps de Marc : ");
        duree marc = new duree();
        marc.afficheDuree();


        System.out.print("Temps de Val  : ");
        duree valentino = new duree();
        valentino.afficheDuree();

        marc.egal(valentino);




        System.out.println("\n*********************************************");
        System.out.println("*************GRAND PRIX DU JAPON*************");
        System.out.println("*********************************************");

        System.out.println("");

        System.out.print("Temps de Marquez au gp du Japon   : ");
        marc.setDuree(2,50,10);
        marc.afficheDuree();


        System.out.print("       Pénalité: " + 50 + "s       Total  : " );
        marc.ajouteSecALaDuree(65,-10 );
        marc.afficheDuree();

        System.out.println("");



        System.out.print("Temps de Rossi au gp du Japon     : ");
        valentino.setDuree(2,32,15);
        valentino.afficheDuree();

        System.out.print("       Pénalité: " + 15 + "m " + 50 + "s   Total  : " );
        valentino.ajouteSecALaDuree(0,50 );
        valentino.afficheDuree();

        int valJap = valentino.conversionEnSec();

        marc.egal(valentino);




        System.out.println("\n*********************************************");
        System.out.println("*************GRAND PRIX D'ITALIE*************");
        System.out.println("*********************************************");
        System.out.println("");

        duree marc2 = new duree();

        System.out.print("Temps de Marquez au gp d'Italie   : ");
        marc2.setDuree(1,45,0);

        marc2.afficheDuree();


        System.out.println("");


        duree valentino2 = new duree(); 
        System.out.print("Temps de Rossi au gp d'Italie     : ");
        valentino2.setDuree(1,21,03);
        valentino2.afficheDuree();

        marc2.egal(valentino2);



        System.out.println("\n*********************************************");
        System.out.println("**********COMPARATIF DU TEMPS TOTAL**********");
        System.out.println("*********************************************");

        System.out.println("");
        System.out.print("Temps total de Marc sans bonus         : " );
        marc.somme2Duree(marc2);
        marc.afficheDuree();

        System.out.println("       Bonus temps de Marc             : " + 1 + "m " + 10 + "s " );
        marc.ajouteSecALaDuree(-1,-10);
        System.out.print("       Temps final de Marc             : ");
        marc.afficheDuree();


        System.out.println("");
        System.out.print("Temps total de Valentino sans bonus    : " );
        valentino.somme2Duree(valentino2);
        valentino.afficheDuree();

        System.out.println("       Bonus temps de Valentino        : " + 7 + "s " );
        valentino.ajouteSecALaDuree(0,-7);
        System.out.print("       Temps final de Valentino        : ");

        valentino.afficheDuree();



        System.out.println("");



        marc.egal(valentino);




    }
}
