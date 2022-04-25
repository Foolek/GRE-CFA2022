package TD1;
import java.text.DecimalFormat;
import java.util.*;



public class Calculatrice implements IOperation {

    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    float a, b;

    public Calculatrice(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int addition() {
        return (int) (a +b);
    }

    @Override
    public int soustraction() {return (int) (a - b);}

    @Override
    public long multiplication() {
        return (long) (a * b);
    }

    @Override
    public float division() {return a / b;}
}
