package TD2.constrForme;

public class segment {

    public point segDebut, segFin;
    public static int i;

    //CONSTRUCTORS
    public segment(){
        segment seg = new segment(new point(0,0), new point(0,0));
        this.i = 0;}

    public segment(point a, point b){
        this.segDebut = a; this.segFin = b;
    }



}
