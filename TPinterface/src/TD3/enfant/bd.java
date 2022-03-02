package TD3.enfant;
import TD3.Livre;
import java.text.DecimalFormat;

public class bd extends Livre implements romanGraphique {
    private String dessinateur;

    public bd(String titre, String auteur, int pages, String dessinateur) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
        this.dessinateur = dessinateur;
    }

    @Override
    public boolean appercieParLesInrocks(boolean a) {
        return false;
    }
    @Override
    public void affiche(){
        super.displayRom();
        System.out.println(
                "Dessinateur : " + dessinateur +
                "\nPrix du livre : " + df.format(calculerPrix()) +  "€ ");
    }
    @Override
    public double calculerPrix(){
        double sum = 0;
        for(int i = 0; i < pages; i++){
            sum = sum + 0.03;
        }
        return sum;

    }


}
