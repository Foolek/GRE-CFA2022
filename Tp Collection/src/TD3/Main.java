package TD3;

public class Main {

    public static void main(String[] args) {


        int table[] = {1,2,3,4,5,6,7,8,9,10,12,18};
        int tempInt = 0;
        for (int a : table) {
            if(testParite(a)){
                tempInt++;
            }
        }
        System.out.print("Nombres d'entiers pairs: " + tempInt);
        System.out.println("");


        char ascii[] = {'a','b','c','d','e','f','g','h'};
        int tempChar = 0;
        for (int a : ascii) {
            if(testParite(a)){
                tempChar++;
            }
        }
        System.out.print("Nombres de caractères pairs: " + tempChar);
    }

    public static boolean testParite(int a){
        if (a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
