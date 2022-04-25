package TD3.enfant;


import TD3.Livre;

import java.text.DecimalFormat;

public class roman extends Livre implements romanGraphique{

    boolean bgconcourt;

    public roman(){
        this.titre = "";
        this.auteur = "";
        this.pages = 0;
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

    @Override
    public boolean appercieParLesInrocks(boolean a) {
        return false;
    }

    @Override
    public void affiche() {
        titre = "La menace fantome";
        auteur = "Freeze Coreleone";
        pages = 667;
        super.displayRom();
        System.out.println("Prix du livre : " + df.format(calculerPrix()) +  "€ ");
    }

    @Override
    public double calculerPrix(){
        double sum = 0;
        for(int i = 0; i < pages; i++){
            sum = sum + 0.01;
        }
        return sum;
    }

}
