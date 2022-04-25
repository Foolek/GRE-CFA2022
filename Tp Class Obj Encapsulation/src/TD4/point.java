package TD4;
import java.util.*;


public class point{
    private int abscisseX;
    private int ordonneeY;
    private int nbrPts = 0;

    point(){
        this.abscisseX = 0;
        this.ordonneeY = 0;
    }

    //Méthode accessible par l'utilisateur dans la classe main
    //
    //
    public void setX(int x){this.abscisseX = x;}    //Donne une valeur a X
    public void setY(int y){this.ordonneeY = y;}    //Donne une valeur a Y

    public void affichageCoords(){ // affichage des coordonnées du point
        System.out.println(" ");

        System.out.println("Félicitations ! Le point " + this.nbrPts + " a été créé !");
        System.out.println("Celui ci est représenté ci dessous par '*'");
        System.out.println("position: " + getX() + ":" + getY());
        System.out.println(" ");


        System.out.println("x");
        for(int a = this.abscisseX; a > 0; a--) {
            if(a == this.abscisseX){
                for (int b = 0; b <= this.ordonneeY; b++) {
                    if(b == 0 ){
                        System.out.print(".  ");
                    }
                    if(b != 0 & b != this.ordonneeY){
                        System.out.print("   ");
                    }
                    if(b == this.ordonneeY){
                        System.out.println("*");
                    }
                }
            }else{
                System.out.println(".");
            }
        }
        for (int b = 0; b <= ordonneeY; b++) {
            System.out.print(".  ");
        }

        System.out.print("y");

        System.out.println(" ");
        System.out.println(" ");

        this.nbrPts++;

    }


    public boolean egal(point point2){    //Compare et déterminesi 2 points 2D coincident
        if(getX() == point2.getX() & getY() == point2.getY() ){
            System.out.println("Les 2 points coincident");
            return true;
        }else{
            System.out.println("Les 2 points ne coincident pas");
            return false;
        }
    }


    public double calcD(point p2){   //Calcul une distance entre 2 points
        int x1 = abscisseX - p2.abscisseX;
        x1 = x1 * x1;

        int x2 = ordonneeY - p2.ordonneeY;
        x2 = x2 * x2;

        int x3 = x1 + x2;

        return Math.sqrt(x3);  //Math sqrt retourne le carré d'une valeur
    }
    //
    //
    // Fin des méthodes accessible par l'utilisateur




    // Innaccessible par l'utilisateur
    //
    //


    private int getX(){    //Recupère X
        return abscisseX;
    }
    private int getY(){    //Recupère y
        return ordonneeY;
    }




}
