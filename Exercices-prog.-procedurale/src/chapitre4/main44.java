package chapitre4;
import java.util.*;

public class main44 {
    public static void main(String[] args) {

        for(int scInt = 33; scInt < 127; scInt++){
            System.out.println("Caractère = " + (char)scInt + " Code decimal = " + scInt + " Code hexadecimal = " + Integer.toHexString(scInt));
        }

    }
}
