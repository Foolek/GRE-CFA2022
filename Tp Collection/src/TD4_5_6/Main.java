package TD4_5_6;

import TD4_5_6.Point.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.awt.Color.black;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nExcercice 4");
        exo4();
        System.out.println("\n\nExcercice 5");
        exo5();
        System.out.println("\n\nExcercice 5 suite");
        exo5suite();
        System.out.println("\n\nExcercice 6");
        exo6();










    }

    private static void triTabSurX(Point tabPts[]) {
        Point[] temp = {null};
        for (int i = 0; i < tabPts.length - 1; i++) {
            for (int j = i + 1; j < tabPts.length; j++) {
                if (tabPts[i].getX() > tabPts[j].getX()) {
                    temp[0] = tabPts[i];
                    tabPts[i] = tabPts[j];
                    tabPts[j] = temp[0];
                }
            }
        }
    }

    private static Object max(List<? extends Object> list, int begin, int end){

        Integer maxElem = null;
        Double maxElemDble = null;
        Character maxChar = null;


        if (list.get(begin) instanceof Integer) { // Integer
            maxElem = (Integer) list.get(begin);
            for (int i = begin; i < end; i++){
                if (maxElem.compareTo((Integer) list.get(i)) < 0) {
                    maxElem = (Integer) list.get(i);
                }
            }
            return maxElem;
        }else if (list.get(begin) instanceof Double) { //Double
            maxElemDble = (Double) list.get(begin);
            for (int a = begin; a < end; a++){
                if (maxElemDble.compareTo((Double) list.get(a)) < 0) {
                    maxElemDble = (Double) list.get(a);
                }
            }
            return maxElemDble;
        }else if (list.get(begin) instanceof Character) { // Character
            maxChar = (Character) list.get(begin);
            for (int a = begin; a < end; a++){
                if (maxChar.compareTo((Character) list.get(a)) < 0) {
                    maxChar = (Character) list.get(a);
                }
            }
            return maxChar;
        }else{
            return null;
        }
    }


    private static void exo4(){
        Point tabPts[] = new Point[3];
        tabPts[0] = new Point('A', 3, 2);
        tabPts[1] = new Pixel('B', 10, 8, black);
        tabPts[2] = new Point3D('C', 2, 8, 9);

        System.out.println("Tableau de point avant le tri :");
        System.out.print("* Point "); tabPts[0].affiche();
        System.out.print("* Pixel "); tabPts[1].affiche();
        System.out.print("* Point 3D ");tabPts[2].affiche();
        System.out.println(" ");
        System.out.println(" ");

        triTabSurX(tabPts);
        System.out.println("Tableau de point après le tri :");

        System.out.print("* Point "); tabPts[0].affiche();
        System.out.print("* Pixel "); tabPts[1].affiche();
        System.out.print("* Point 3D ");tabPts[2].affiche();
    }
    private static void exo5(){
        Point pt1 = new Point('A',13,2);
        Point pt2 = new Point('B', 11,4);
        Point pt3 = new Point('C',34,45);
        Point pt4 = new Point('D',0,2);

        ArrayList<Point> listPts = new ArrayList<Point>();
        listPts.add(pt1);
        listPts.add(pt2);
        listPts.add(pt3);
        listPts.add(pt4);

        System.out.println("Affichage des éléments");
        for (Point a:
                listPts) {
            a.affiche();
        }

        Collections.sort(listPts);

        System.out.println("Affichage des éléments triés");
        for (Point a:
                listPts) {
            a.affiche();
        }
    }
    private static void exo5suite(){
        ArrayList<Point> listPts2 = new ArrayList<Point>();
        Point Pt1 = new Point ('A',13, 2) ;
        Pixel Pt2 = new Pixel ('B',25, 2, black) ;
        Point3D Pt3 = new Point3D ('C',1, 5,3) ;
        Point Pt4 = new Point ('D',0, 0) ;

        listPts2.add(Pt1);
        listPts2.add(Pt2);
        listPts2.add(Pt3);
        listPts2.add(Pt4);

        System.out.println("Affichage des éléments");
        for (Point a:
                listPts2) {
            a.affiche2();
        }

        Collections.sort(listPts2, new ComparePointX());

        System.out.println("Affichage des éléments triés sur coordonnées X");
        for (Point a:
                listPts2) {
            a.affiche2();
        }

        Collections.sort(listPts2, new ComparePointY());
        System.out.println("Affichage des éléments triés sur coordonnées Y");
        for (Point a:
                listPts2) {
            a.affiche2();
        }

    }
    private static void exo6(){
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(16);
        listInt.add(32);
        listInt.add(26);
        listInt.add(27);
        listInt.add(65);
        listInt.add(15);

        System.out.println(max(listInt, 0, listInt.size()));

        ArrayList<Double> listDble = new ArrayList<>();
        listDble.add(10.91);
        listDble.add(10.15);
        listDble.add(10.12);
        listDble.add(10.69);
        listDble.add(10.41);
        listDble.add(10.85);

        System.out.println(max(listDble, 0, listDble.size()));

        Character tabCarac[]={'a','b', 'z','d','e', 'f', 'g', 'h' };
        List<Character> myLstCarac = new ArrayList<Character>(Arrays.asList(tabCarac));


        System.out.println(max(myLstCarac, 0, myLstCarac.size()));
    }
}