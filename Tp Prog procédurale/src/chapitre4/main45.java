package chapitre4;
import java.util.*;

public class main45{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] morse = {".-","−...","−.−.","−..",".","..−.",".−−·","....","..",".−−−","−.−",".−..","−−","−.","−−−",".−−.","−−.−",".-.","...","-","..−","...−",".−−","−..−","−.−−","−−..",};
        String[] code = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        char[] code1 = {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q', 'r','s','t','u','v','w','x','y','z'};

        System.out.println("Entrez du texte pour qu'il soit converti en morse");
        String test = sc.nextLine().toUpperCase();

        String temp = "";

        for (int i = 0; i < test.length(); i++){
            if(test.charAt(i) >= 65 & test.charAt(i) < 91){
            temp = temp + morse[test.charAt(i)- 65] + "  ";}

        }
        System.out.print(temp );

    }
}
