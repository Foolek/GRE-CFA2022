package TD3;

public class NewInteger {

    int a ;
    int b ;

    NewInteger(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void permut(){
        int c = 0;
        c = a;
        a = b;
        b = c;
    }

    public void affiche(){
        System.out.println( a + " "  + b );
    }

} 
