package TD1.enfant;


import TD1.Livre;

import java.text.DecimalFormat;

public class roman extends Livre{

    boolean bgconcourt;

    public roman(){
        this.titre = "";
        this.auteur = "";
        this.pages = 0;

    }


    public void afficheSansParam(){
        titre = "La menace fantome";
        auteur = "Freeze Coreleone";
        pages = 667;
        super.displayRom();
        System.out.println("Prix du livre : " + df.format(calculerPrix()) +  "€ ");

    }

    public roman(String titre, String auteur, int pages, boolean prime){
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;

        super.displayRom();

        System.out.println(
                "Prime prix Goncourt : " + prime +
                "\nPrix du livre : " + df.format(calculerPrix()) +  "€ "
        );
    }

    private double calculerPrix(){
        double sum = 0;
        for(int i = 0; i < pages; i++){
            sum = sum + 0.01;
        }
        return sum;
    }

}
