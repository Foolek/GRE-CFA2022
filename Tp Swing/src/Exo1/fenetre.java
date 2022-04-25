package Exo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class fenetre extends JFrame {


	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	//Liste des noms de nos conteneurs pour la pile de cartes
	String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
	int indice = 0;


	JPanel pan = new JPanel();

	public fenetre() {
		setSize(400,400); // taille de la fenetre
		setDefaultCloseOperation(EXIT_ON_CLOSE); // termine le processus si la fenetre est fermée
		setTitle("Exo1"); // titre fenetre

		panelconfig();

		setVisible(true); // fenetre est visible, à mettre en dernier
	}

	/* ******************* PANEL ******************* */

	private void panelconfig(){
		setContentPane(pan);
		pan.setBackground(Color.DARK_GRAY);
		pan.setVisible(true);

		bleu();
		jaune();
		rouge();
	}


	/* ****************** BOUTTONS ****************** */

	private JButton bleu(){
		JButton bluebtn = new JButton("Bleu");
		pan.add(bluebtn);
		bluebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pan.setBackground(Color.blue);
			}
		});
		return null;
	}

	private JButton rouge(){
		JButton rougebtn = new JButton("rouge");
		pan.add(rougebtn);
		rougebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pan.setBackground(Color.red);
			}
		});
		return null;
	}
	private JButton jaune(){
		JButton jaunebtn = new JButton("Jaune");
		pan.add(jaunebtn);
		jaunebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pan.setBackground(Color.yellow);
			}
		});
		return null;
	}


}
