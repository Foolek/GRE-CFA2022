package TD4_5_6.Point;

import java.awt.*;

public class Pixel extends Point {
    private char name;
    private int x, y;
    private Color couleur;

    public Pixel(){
        this.name = ' ';
        this.x = 0;
        this.y = 0;
        this.couleur = null;
    }

    public Pixel(char name, int x, int y, Color couleur) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("   - Ma couleur est " + getCouleur());
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
    public char getName() {
        return name;
    }
    public Color getCouleur() {
        return couleur;
    }
}
