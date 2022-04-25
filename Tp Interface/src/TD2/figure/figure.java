package TD2.figure;
import TD2.constrForme.*;


public abstract class figure implements deplacable, dessinable, surface {
    public segment seg[] = new segment[4];

    /* CONSTRUCTORS */
    public figure(){}
    public figure(point a, point b, point c){}
    public figure(point a, point b, point c, point d){}
    public figure(segment a, segment b){}



    /* OVERRIDE DES MÉTHODES*/
    @Override
    public void seDessiner() {
    }
    @Override
    public void deplacer(int dx, int dy) {
    }


}
