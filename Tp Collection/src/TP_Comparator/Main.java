package TP_Comparator;

import TP_Comparator.Society.CompareEtudiant;
import TP_Comparator.Society.Humans.Etudiant;
import TP_Comparator.Society.Societe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        testAfficheCompareEtudiants();


        System.out.println("\n");
        Societe society = new Societe();
        ArrayList<Etudiant> entreprise = society.listePersonnel;
        Etudiant etudiant0 = new Etudiant ("Durand","Michel",55);
        Etudiant etudiant1 = new Etudiant( "Mercier", "Jean",50 );
        Etudiant etudiant2 = new Etudiant( "Morin", "Nathalie",35 );
        Etudiant etudiant3 = new Etudiant( "Martin", "Louis",35 );
        Etudiant etudiant4 = new Etudiant( "Dupont", "Josette",25 );
        Etudiant etudiant5 = new Etudiant( "Charpentier", "Pierre", 25);

        society.Recruter(etudiant0);
        society.Recruter(etudiant1);
        society.Recruter(etudiant2);
        society.Recruter(etudiant3);
        society.Recruter(etudiant4);
        society.Recruter(etudiant5);

        society.afficher(entreprise);

        society.Congedier(etudiant0);

        society.afficher(entreprise);

        System.out.println("\nTri du personnel :");

        Collections.sort(entreprise, new CompareEtudiant());

        society.afficher(entreprise);




    }

    public static void testAfficheCompareEtudiants(){
        System.out.println("\n");

        Etudiant etudiant1 = new Etudiant("Dupont", "Albert", 22);
        Etudiant etudiant2 = new Etudiant("DUPONT", "albert", 22);
        Etudiant etudiant3 = new Etudiant("Mercier", "Jean", 55);
        Etudiant etudiant4 = new Etudiant("MERCIER", "Jean", 55);

        etudiant1.showEquals(etudiant2);
        etudiant1.showEquals(etudiant3);
        etudiant1.showEquals(etudiant4);
        etudiant3.showEquals(etudiant4);

        System.out.println("\n");

        System.out.println(etudiant1.toString());
        System.out.println(etudiant2.toString());
        System.out.println(etudiant3.toString());
        System.out.println(etudiant4.toString());


        System.out.println("\n                    *********************");
    }
}

