package Cours;

import javax.swing.*;

public class Main {
	//Fichier Mainclass.java
	protected static void createAndShowGUI() {
		MyFen fen = new MyFen("titre");
		fen.setSize(400, 400);
		fen.setVisible(true);
	}
	public static void main(String[] args) {
//thread création objet graphique et rend la main au thread principal ;
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() { createAndShowGUI() ; }
		});
	}
}