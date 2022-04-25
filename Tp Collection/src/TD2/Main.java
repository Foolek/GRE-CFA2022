package TD2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Perroquet Jacko = new Perroquet("Jacko", "Rouge", "Koco");
        Perroquet Pico = new Perroquet("Pico", "vert", "coco");
        String table[] = {"String1", "String2"};

        Perroquet Voiliere[] = {Jacko, Pico};

        swap(table);
        System.out.println("");

        System.out.println("Avant permutation des perroquets dans la voilière:");
        Jacko.affiche();
        Pico.affiche();
        Perroquet.i = 1;

        System.out.println("");
        System.out.println("Après permutation des perroquets dans la voilière:");
        swap(Voiliere);
        Voiliere[0].affiche();
        Voiliere[1].affiche();
    }


    public static void swap(String val[]){
        System.out.println("Before permut: " + val[0] + " " + val[1]);
        String temp = val[0];
        val[0] = val[1];
        val[1] = temp;
        System.out.println("After permut : " + val[0] + " " + val[1]);
    }

    public static void swap(Perroquet val[]){
        Perroquet[] temp = {null};
        temp[0] = val[1];
        val[0] = val[1];
        val[1] = temp[0];
    }
}
