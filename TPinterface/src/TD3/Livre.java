package TD3;

import TD3.enfant.bd;
import TD3.enfant.roman;

import java.text.DecimalFormat;


public class Livre {

    protected String titre;
    protected String auteur;
    protected int pages;
    protected DecimalFormat df = new DecimalFormat("#.##"); // formate l'affichage des nombres pour montrer seulement 2 chiffres apres la virgule

    public Livre(){
        this.titre = "";
        this.auteur = "";
        this.pages = 0;
    }


    public void displayRom(){
        System.out.println(
                "Titre :  " + titre +  " " +
                "\nAuteur : " + auteur +
                " \nNombre de pages : " + pages
        );
    }
}
