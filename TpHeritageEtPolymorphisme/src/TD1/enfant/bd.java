package TD1.enfant;
import TD1.Livre;
import java.text.DecimalFormat;

public class bd extends Livre {
    private String dessinateur;

    public bd(String titre, String auteur, int pages, String dessinateur) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
        this.dessinateur = dessinateur;
    }

    public void afficheBD(){
        super.displayRom();
        System.out.println(
                "Dessinateur : " + dessinateur +
                "\nPrix du livre : " + df.format(calculerPrix()) +  "€ ");
    }

    private double calculerPrix(){
        double sum = 0;
        for(int i = 0; i < pages; i++){
            sum = sum + 0.03;
        }
        return sum;

    }


}
