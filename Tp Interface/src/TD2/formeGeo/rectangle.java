package TD2.formeGeo;
import TD2.constrForme.point;
import TD2.constrForme.segment;
import TD2.figure.*;

public class rectangle extends figure {
    public static int val = 1;
    double longeur = 0;
    double largeur = 0;
    point pt[] = new point[4];



    /* CONSTRUCTORS */
    public rectangle(){
        longeur = 0;
        largeur = 0;
    }
    public rectangle(point a, point b, point c, point d){}
    public rectangle(segment largeur, segment longueur){
        seg[0] = longueur;
        seg[1] = largeur;
        seg[2] = longueur;
        seg[3] = largeur;
    }
    public rectangle(segment w, segment x, segment y, segment z){
        seg[0] = new segment(w.segDebut, w.segFin);
        seg[1] = new segment(x.segDebut, x.segFin);
        seg[2] = new segment(y.segDebut, y.segFin);
        seg[3] = new segment(z.segDebut, z.segFin);
    }




    /* OVERRIDE DES MÉTHODES*/
    @Override
    public double getSurface() {
        double longueur =  seg[0].segDebut.calcDistance(seg[0].segFin);
        double largeur =  seg[0].segFin.calcDistance(seg[2].segDebut);
        return longueur * largeur;

    }


    @Override
    public void deplacer(int dx, int dy) {
        for (int i = 0; i < 4; i++){
            seg[i].segDebut.setX(seg[i].segDebut.getX() + dx);
            seg[i].segFin.setY(seg[i].segFin.getY() + dy);
        }
    }


    @Override
    public void seDessiner() {
        System.out.println("Dessin du Rectangle numéro " + val);
        val++;

        for (int i = 0; i < 4; i++){
            String print = "Segment " + i + " -> " + seg[i].segDebut.getName() + ":" + seg[i].segDebut.getX() +
                    ";" + seg[i].segDebut.getY() + "  " + seg[i].segFin.getName() + ":" + seg[i].segFin.getX() +
                    ";" + seg[i].segFin.getY() + " ";

            if(i % 2 == 0){
                System.out.println(print + "segment horizontal" );
            }else{
                System.out.println(print + "segment vertical" );
            }
        }



    }
}
