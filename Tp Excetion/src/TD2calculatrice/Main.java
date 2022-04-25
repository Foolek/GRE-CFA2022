package TD2calculatrice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice();

		int entier1 = calc.saisieEntier();
		char op = calc.saisieOperateur();
		int entier2 = calc.saisieEntier();
		int resultat = calc.calculer(entier1, op, entier2);

		System.out.println(resultat);

	}
}
