package TD2.formeGeo;
import TD2.constrForme.segment;
import TD2.figure.*;

public class triangle extends figure{

    public static int val2 = 1;
    private double hauteur;
    private double base = 0;
    static double aire;


    public triangle() {
        base = 0;
        hauteur = 0;}

    public triangle(segment a, segment b, segment c){
        seg[0] = new segment(a.segDebut, a.segFin);
        seg[1] = new segment(b.segDebut, b.segFin);
        seg[2] = new segment(c.segDebut, c.segFin);
    }





    /* OVERRIDE DES MÉTHODES*/
    @Override
    public double getSurface() {
        double a = seg[0].segDebut.calcDistance(seg[1].segDebut);
        double b = seg[0].segFin.calcDistance(seg[2].segFin);
        this.aire = (a*b)/2;
        return aire;
    }

    @Override
    public void deplacer(int dx, int dy) {
        for (int i = 0; i < 3; i++){
            seg[i].segDebut.setX(seg[i].segDebut.getX() + dx);
            seg[i].segFin.setY(seg[i].segFin.getY() + dy);
        }
    }

    @Override
    public void seDessiner() {
        System.out.println("Dessin du Triangle numéro " + val2);
        val2++;
        for (int i = 0; i < 3; i++){

            String print = "Segment " + i + " -> " + seg[i].segDebut.getName() + ":" + seg[i].segDebut.getX() +
                    ";" + seg[i].segDebut.getY() + "  " + seg[i].segFin.getName() + ":" + seg[i].segFin.getX() +
                    ";" + seg[i].segFin.getY() + " ";
            if(i == 0){
                System.out.println(print + " Côté Adjacent (vertical) au point B");
            }else if(i == 1){
                System.out.println(print + " Côté Adjacent (horizontal) au point C");
            }else{
                System.out.println(print + " Hypoténus ");
            }
        }

    }

}
