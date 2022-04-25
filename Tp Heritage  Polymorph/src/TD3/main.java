package TD3;

import TD3.*;
import TD3.enfant.Animal;
import TD3.enfant.Animaux.Mamifere;
import TD3.enfant.Animaux.Oiseau;

import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int nbAnimaux = 0;
        boolean b = true;
        Animal[] arche;

        while(b){
            System.out.println("Entrez le nombre d'animaux dans l'arche");
            nbAnimaux = sc.nextInt();
            arche = new Animal[nbAnimaux];




            for(int i = 1; i < arche.length; i++){

                System.out.println("Donnée pour l'animal n°" + i + "...");

                System.out.println("L'animal est un mamifère (entrez 0) ou un oiseau (entrez 1) ? ");
                int type = sc.nextInt();

                System.out.println("Quel est son nom ? ");
                String name = sc.next();

                System.out.println("De quel couleur est-il ? ");
                String couleur = sc.next();

                System.out.println("Quel est son cri ? ");
                String cri = sc.next();


                if(type == 0){
                    System.out.println("De combien de temps est la durée de sevrage (en mois) ? ");
                    int duree = sc.nextInt();
                    arche[i] = new Mamifere(name, couleur, cri, duree);
                    arche[i].affiche();

                }if(type == 1){
                    System.out.println("De quel taille font ses ailes en centimetres ? ");
                    float duree = sc.nextFloat();
                    arche[i] = new Oiseau(name, couleur, cri, duree);
                    arche[i].affiche();
                }
            }
        }
    }
}
