package TD4_5_6.Point;

public class Point implements Comparable<Point> {

    private char name;
    private int x, y;
    public Point(){
        this.name = ' ';
        this.x = 0;
        this.y = 0;

    }
    public Point(char name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println(getName() + " " + getX() + " " + getY());
    }
    public void affiche2(){
        System.out.println(getName() + " " + getX() + " " + getY());
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public char getName() {
        return name;
    }

    @Override
    public int compareTo(Point B) {
        return (this.x - B.x);
    }
}
