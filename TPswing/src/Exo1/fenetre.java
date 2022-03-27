package Exo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class fenetre extends JFrame {
	JPanel pan = new JPanel();
	public fenetre() {
		this.setSize(800,600); // taille de la fenetre
		this.setResizable(false); // impossible de changer la taille de la fen avec le curseur
		this.setAlwaysOnTop(true); // toujours au premier plan
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // termine le processus si la fenetre est fermée
		this.setVisible(true); // est visible
		this.setTitle("Exo1");

		CardLayout cl = new CardLayout();

		this.setLayout(cl);

		this.setContentPane(pan);

		this.getContentPane().add(new JButton("Jaune"));
		this.getContentPane().add(new JButton("Bleu"));
		this.getContentPane().add(new JButton("Rouge"));

		panelconfig();
	}


	public void panelconfig(){
		pan.setBackground(Color.lightGray);
		pan.setVisible(true);
	}

	public MouseListener jaune(){
		this.getContentPane().setBackground(Color.YELLOW);
		return null;
	}


}
