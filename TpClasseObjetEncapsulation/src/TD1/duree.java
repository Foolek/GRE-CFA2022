package TD1;

import java.util.Formatter;

public class duree{
    int heures = 0;
    int minutes = 0;
    int secondes = 0;


    public void afficheDuree(){
        Formatter format = new Formatter();
        format.format("%02dh%02dm%02ds", heures, minutes, secondes);
        System.out.println(format);
    }


    public void setDuree(int h, int m, int s){
        if( m < 60 & s < 60){
            heures = h;
            minutes = m;
            secondes = s;
        }else{
            heures = 0;
            minutes = 0;
            secondes = 0;
        }
    }


    public int conversionEnSec(){
        return (heures * 3600) + (minutes * 60) + secondes;
    }


    public boolean egal(duree val2){
        if(conversionEnSec() == val2.conversionEnSec()){
            System.out.println("\n   Marc et Valentino ont un temps identique");
        }if(conversionEnSec() > val2.conversionEnSec()){
            System.out.println("\n Valentino a fait un meilleur temps que Marc\n           Valentino ressort vainqueur");
        }else if(conversionEnSec() < val2.conversionEnSec()){
            System.out.println("\n Marc a fait un meilleur temps que Valentino\n           Marc ressort vainqueur");
        }
        return true;
    }


    public void ajouteSecALaDuree(int m, int s){

        int totalHMS = heures*3600 + minutes*60 + secondes; // je déclare une variable de ma duréee convertie en seconde pour récup la valeur plus tard
        this.setDuree(heures = 0, minutes = 0, secondes = 0); // je réinitialise la durée saisie

        m = m * 60; // je convertie la saisie m pour minutes et s pour secondes, en secondes
        s = s * 1;


        int total2 = totalHMS + m + s; // je fais une nvelle variable où j'addition les données m et s et l'addition à mon totalHMS


        if(total2 > 0){
            for(int i = 0; i < total2; i++){
                if(i == 59){  // arrivé à 59 secondes
                    minutes++; // j'ajoute "1" au compteur minutes
                    total2 = total2 - 60; // j'enlève 60 à la valeur de total2 jusqu'à ce qu'elle atteigne 0
                    i = 0; // je reset "i" afin que la boucle opère à nouveau
                } 
                if(minutes == 59){ // lorsque le compteur des minutes arrive à 59
                    heures++;      // j'ajoute "1" dans le compteur des heures
                    minutes = minutes - 60; // je vide le compteur minutes qui sera à nouveau rempli si secondes arrive à 60
                }
            }
        }


        /*
        je créer une boucle pour les valeurs négatives qui représente le "bonus" de Marc ou Valentino
        contrairement à l'ajout de seconde basique, le bonus doit retirer du temps, la valeur saisie sera donc négative
         */

        if(total2 < 0){
            for(int i = 0; i > total2; i--){
                if(i == -59){
                    minutes--;
                    total2 = total2 + 60;
                    i = 0;
                }
                if(minutes == -59){
                    heures--;
                    minutes = minutes + 60;
                }
            }
        }

        this.setDuree(heures, minutes, total2);
    }

    public void somme2Duree(duree d2){


        int total1 = heures*3600 + minutes*60 + secondes;
        int total2 = d2.heures*3600 + d2.minutes*60 + d2.secondes;

        int total3 = total1 + total2;

        heures = 0; minutes = 0; secondes = 0;
        d2.heures = 0; d2.minutes = 0; d2.secondes = 0;

        if(total3 > 0){
            for(int i = 0; i < total3; i++){
                if(i == 59){  // arrivé à 59 secondes
                    minutes++; // j'ajoute "1" au compteur minutes
                    total3 = total3 - 60; // j'enlève 60 à la valeur de total2 jusqu'à ce qu'elle atteigne 0
                    i = 0; // je reset "i" afin que la boucle opère à nouveau
                }
                if(minutes == 59){ // lorsque le compteur des minutes arrive à 59
                    heures++;      // j'ajoute "1" dans le compteur des heures
                    minutes = minutes - 60; // je vide le compteur minutes qui sera à nouveau rempli si secondes arrive à 60
                }
            }
        }
    }
}