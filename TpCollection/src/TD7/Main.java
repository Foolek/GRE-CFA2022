package TD7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> glossaire = new HashMap<>();
        glossaire.put("Sous classe".toLowerCase(), "Classe héritant d'une autre classe.");
        glossaire.put("Méthode".toLowerCase(), "Une fonction destinatrice d'un message.");
        glossaire.put("Classe dérivée".toLowerCase(), "Classe héritant d'une autre classe.");
        glossaire.put("Polymorphisme".toLowerCase(), "Un comportement différent pour un meme objet.");
        glossaire.put("Collection".toLowerCase(), "Instance d'une classe générant un ensemble d'éléments.");
        glossaire.put("Bonheur".toLowerCase(), "Maitriser JAVA et ses subtilités.");
        glossaire.put("Interface".toLowerCase(), "Classe dont toutes les méthodes sont abstraites.");
        glossaire.put("Instance".toLowerCase(), "Objet créé à partir d'une classe.");

        ArrayList<String[]> glossaireString = new ArrayList<>();
        int i = 0;

        for (Map.Entry<String, String> entry : glossaire.entrySet()){
            System.out.println(entry.getKey());
        }


        boolean b = true;

        Scanner sc = new Scanner(System.in);
        while(b == true){
            String saisie;
            System.out.println("""

                    Saisir un des mot présent dans ce glossaire pour en afficher sa définition;
                    Votre saisie : """);

            saisie = sc.nextLine().toLowerCase();

            if(glossaire.containsKey(saisie)){
                System.out.println(glossaire.get(saisie));
            }else{
                System.out.println("non");
            }
            System.out.println("Voulez vous continuer ? o/n");
            if(sc.hasNext("n")){
                b = false;
            }

        }




    }
}
