package TD4;

import java.util.*;

public class main {
    public static void main(String[]args){


            Scanner sc = new Scanner(System.in);
            int x = 0;
            int y = 0;


            point point0 = new point();
            point0.setX(0);
            point0.setY(0);
            point0.affichageCoords();

            point point1 = new point();
            point point2 = new point();



            //////// POINT A ////////
            System.out.println("");
            System.out.println("----- Création d'un point A  -----");

            System.out.println("Entrez une abscisse X pour A ");
            x = sc.nextInt();
            point1.setX(x);

            System.out.println("Entrez une ordonnée Y pour A");
            y = sc.nextInt();
            point1.setY(y);

            point1.affichageCoords();


            //////// POINT B ////////
            System.out.println("");
            System.out.println("----- Création d'un point B -----");

            System.out.println("Entrez une abscisse X pour B");
            x = sc.nextInt();
            point2.setX(x);

            System.out.println("Entrez une ordonnée y pour B");
            y = sc.nextInt();
            point2.setY(y);

            point2.affichageCoords();

            double cab, c0a, c0b;
            cab = (double) point1.calcD(point2);
            c0a = (double) point0.calcD(point1);
            c0b = (double) point0.calcD(point2);

            if(cab > c0a | cab > c0b){
                    System.out.println("La distance entre le point 1 et 2 est plus grande que celle entre 0 et 1");
            }



    }
}
