package TD2;
import TD2.figure.*;
import TD2.constrForme.*;
import TD2.formeGeo.*;

public class mainFigureGeo {
    public static void main(String[] args) {



        /*           TRIANGLE RECT 1           */
        // Construction des points d'un triangle
        point triRectEnCePT1 = new point(0, 0, "A");
        point triAbcisse1 = new point(2, 0, "B");
        point triOrdonnee1 = new point(0, 2, "C");

        // Construction des segments formant le triangle
        segment adjVertical1 = new segment(triRectEnCePT1, triAbcisse1);
        segment hypotenus1 = new segment(triAbcisse1, triOrdonnee1);
        segment adjHorizontal1 = new segment(triOrdonnee1, triRectEnCePT1);

        // Concrétisation du Triangle Rectangle
        triangle triangle1 = new triangle(adjVertical1, hypotenus1, adjHorizontal1);


        /*           TRIANGLE RECT 2           */
        point triRectEnCePT2 = new point(0, 0, "A");
        point triAbcisse2 = new point(2, 0, "B");
        point triOrdonnee2 = new point(0, 2, "C");

        segment adjVertical2 = new segment(triRectEnCePT2, triAbcisse2);
        segment hypotenus2 = new segment(triAbcisse2, triOrdonnee2);
        segment adjHorizontal2 = new segment(triOrdonnee2, triRectEnCePT2);

        triangle triangle2 = new triangle(adjVertical2,adjHorizontal2, adjHorizontal2 );





        /*           RECTANGLE 1           */
        // Construction des points d'un rectangle
        point hautGauche1 = new point(3, 0, "Z");
        point basGauche1 = new point(0, 0, "W");
        point hautDroite1 = new point(3, 2, "Y");
        point basDroite1 = new point(0, 2, "X");

        // Construction des segments formant le rectangle
        segment horizontalHaut1 = new segment(hautDroite1, hautGauche1);
        segment horizontalBas1 = new segment(basGauche1, basDroite1);

        segment verticalDroite1 = new segment(basDroite1, hautDroite1);
        segment verticalGauche1 = new segment(hautGauche1, basGauche1);

        // Concrétisation du Rectangle
        rectangle rect1 = new rectangle(horizontalBas1, verticalDroite1, horizontalHaut1, verticalGauche1);

//        System.out.println("Surface du rectangle 2 : " +  rect1.getSurface());


        /*           RECTANGLE 2           */
        point hautGauche2 = new point(3, 2, "Z");
        point basGauche2 = new point(0, 0, "W");
        point hautDroite2 = new point(2, 0, "Y");
        point basDroite2 = new point(0, 2, "X");

        // Je n'ai besoin que de 2 segments pour reconnaître un rectangle (longueur et largeur)
        segment horizontalHaut2 = new segment(hautDroite2, hautGauche2);
        segment horizontalBas2 = new segment(basGauche2, basDroite2);

        segment verticalDroite2 = new segment(basDroite2, hautDroite2);
        segment verticalGauche2 = new segment(hautGauche2, basGauche2);

        rectangle rect2 = new rectangle(horizontalBas2, verticalDroite2, horizontalHaut2, verticalGauche2);



        /*     Création d'un tableau regroupant des figures     */
        figure figure[] = {triangle1, rect1};




        /*     DESSIN DES FIGURES     */
        for (int i = 0; i < figure.length; i++) {
            figure[i].seDessiner();
            System.out.println(" ");
        }



        /*      Déplacement des figures      */

        segment.i = 0;
        triangle.val2 = 0;
        rectangle.val = 0;

        System.out.println("deplacement de x= x+1 y= y+1");
        for (int i = 0; i < figure.length; i++)
            figure[i].deplacer(1, 1);
        ;

        System.out.println("position apres deplacement");
        System.out.println(" ");

        /*      Dessin des figures après déplacement      */
        for (int i = 0; i < figure.length; i++) {
            figure[i].seDessiner();
            System.out.println(" ");
        }

        for (int i = 0; i < figure.length; i++) {
            if (i == 0) {
                System.out.println("Aire du triangle : " + figure[0].getSurface());
            } else {
                System.out.println("Surface du rectangle : " + figure[1].getSurface());
            }
        }



        System.out.println(" ");
        System.out.println("interface ISurface pour comparer 2 figures");
        System.out.println("          avec 2 rectangles          ");
        System.out.println(" ");



        /*      Comparaison des 2 rectangles      */
        System.out.println("Comparaison des 2 rectangles entre eux :");
        if ((rect1).isLargerThan(rect2) == 0){
            System.out.println("    * Les rectangles ont des dimensions identiques");
        }else if( (rect1).isLargerThan(rect2) > 0) {
            System.out.println("    * La surface du 1er rectangle est supérieure à la surface du 2nd rectangle");
        }else{
            System.out.println("    * La surface du 2nd rectangle est supérieure à celle du 1er rectangle");
        }
        System.out.println("    * Égalisation des deux rectangles : ");
        rect2 = rect1;
        if ( (rect1).isLargerThan(rect2) == 0){
            System.out.println("            -Le 1er et le 2nd rectangles ont maintenant des dimensions identiques");
        }
        System.out.println(" ");



        /*      Comparaison des 2 triangles      */
        System.out.println("Comparaison des 2 triangles entre eux :");
        if ( (triangle1).isLargerThan(triangle2) == 0){
            System.out.println("    * Les rectangles ont des dimensions identiques");
        }
        System.out.println(" ");



        /*      Comparaison du 1er Rectangle et du 1er triangle      */
        System.out.println("Comparaison des figures: 1er rectangle et 1er triangle, entre eux :");
        if ( (rect1).isLargerThan(triangle1) > 0){
            System.out.println("    * La surface du rectangle est supérieure à celle du triangle");
        }
        if ( (rect1).isLargerThan(triangle1) < 0){
            System.out.println("    * La surface du triangle est supérieure à celle du rectangle");
        }
        System.out.println(" ");


        /*     Création d'un tableau regroupant toutes les figures et calcul de la somme des surfaces     */
        figure[] allFigure = {rect1, rect2, triangle1, triangle2};

        System.out.println("Somme surface totale : "+ surface.sommeSurface(allFigure));


    }
}
