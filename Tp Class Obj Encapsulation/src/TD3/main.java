package TD3;

public class main {
    public static void main(String[]args){

        NewInteger IntegerA = new NewInteger(10,20);

        System.out.println("avant permutation");
        IntegerA.affiche();
        IntegerA.permut();
        System.out.println("apres permutation");
        IntegerA.affiche();

    }
}
