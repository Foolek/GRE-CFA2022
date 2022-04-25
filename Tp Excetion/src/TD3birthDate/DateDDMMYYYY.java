package TD3birthDate;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DateDDMMYYYY{

	final static int nbdigit = 8;

	int jour;
	int mois;
	int année;

	String strJour;
	String strMois;
	String strAnnée;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime date = LocalDateTime.now();

	Object[][] monthMaxDay = {{"", "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet","Aout", "Septembre", "Octrobre", "Novrembre", "Décembre"}, {0,31,29,31,30,31,30,31,31,30,31,30,31}};



	public DateDDMMYYYY() {

	}

	public DateDDMMYYYY(String date) throws Exception {
		int maxJours[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String maxMois[] = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet","Aout", "Septembre", "Octrobre", "Novrembre", "Décembre"};

		int i = 0;

		this.strJour = date.substring(0,2);
		this.jour = Integer.parseInt(strJour);
		if(jour <= 0 | jour > 31){
			throw new Exception("Erreur dans la saisie du jour");
		}

		this.strMois = date.substring(2,4);
		this.mois = Integer.parseInt(strMois);
		if(mois <= 0 | mois > maxMois.length){
			throw new Exception("Erreur dans la saisie du mois");
		}

		this.strAnnée = date.substring(4,8);
		this.année = Integer.parseInt(strAnnée);
		if(année <= 0 | année> 2022){
			throw new Exception("Erreur dans la saisie de l'année");
		}
	}

	public void affiche(){
		System.out.println(strJour + "/" +  strMois + "/" + strAnnée);
		System.out.println("Date actuelle: " +  dtf.format(date));
	}
}
