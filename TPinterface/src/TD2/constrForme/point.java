package TD2.constrForme;

public class point {
    int x;
    int y;
    String name;


    //CONSTRUCTORS

    public point() {
        x = 0;
        y = 0;
    }

    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public point(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public point(point a){
        x = 0;
        y = 0;
    }


    //GETTERS
    public int getX() {return x;}
    public int getY() {return y;}

    public String getName() {return name;}

    //SETTERS
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}


    //METHODE DE CALCUL DE DISTANCE
    public double calcDistance(point b){
        double distance = Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.getY() - b.getY(),2));
        return distance;
    }
}
