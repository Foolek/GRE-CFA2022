package Cours;

import javax.swing.*;

public class MyFen extends JFrame{ //Fichier MyFen.java
	private String titreFen;
	MyFen(String title ){
		super(title);
		this.titreFen = title;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
