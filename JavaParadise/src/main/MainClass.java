package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

import Fenetre.MenuShowTrip;

public class MainClass {

	public static final int MYSQL = 1;

	public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException {

		UIManager.setLookAndFeel(new MetalLookAndFeel());

		//new IdentificatUser();
		new MenuShowTrip();

	}

}
