package TD1;

import TD1.enfant.bd;
import TD1.enfant.roman;

import java.text.DecimalFormat;


public class Livre {
    protected String titre;
    protected String auteur;
    protected int pages;
    protected DecimalFormat df = new DecimalFormat("#.##"); // formate l'affichage des nombres pour montrer seulement 2 chiffres apres la virgule


    public static void main(String[]args){

        roman romanSansPam = new roman();
        romanSansPam.afficheSansParam();

        System.out.println("");

        roman romanAvecParam = new roman("Code 187", "Hérohachedeuxaif", 93 + 94, true);
        System.out.println("");

        bd bd1 = new bd("La place de la femme c'est à la kouizine", "saint branham", 48, "Anonyme");
        bd1.afficheBD();

    }

    public void displayRom(){
        System.out.println(
                "Titre :  " + titre +  " " +
                "\nAuteur : " + auteur +
                " \nNombre de pages : " + pages
        );
    }
}
