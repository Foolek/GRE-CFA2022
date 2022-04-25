package TD4_5_6.Point;


public class Point3D extends Point {

    private char name;
    private int x, y, z;

    public Point3D(){
        this.name = ' ';
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Point3D(char name, int x, int y, int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("   - Ma coordonnée Z est " + getZ());
    }
    public void affiche2(){
        super.affiche2();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public char getName() {
        return name;
    }
}
