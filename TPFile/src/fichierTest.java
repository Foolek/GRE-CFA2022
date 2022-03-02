import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import TD1GestionExceptionSurFichier.*;

public class fichierTest {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		fichier f = new fichier();


		System.out.println("Entrez le nom du fichier");
		String nomFichier = sc.nextLine();
		f.ouvrir(nomFichier, "Ecriture");
		for(int i = 0; i < 5; i++){
			f.ecrire(i);
		}
		f.fermer();

		f.ouvrir(nomFichier, "Lecture");
		String chaine = " ";
		do{
			chaine = f.lire();
			if(chaine != null){
				System.out.println(chaine);
			}
		}while (chaine != null);

		f.fermer();

	}
}
