package fenetre;

import javax.swing.*;
import java.awt.*;

public class panel1 extends JPanel {
	public panel1() {
		setVisible(true);
		setBackground(Color.lightGray);

		GridLayout grille = new GridLayout(5,5);
		this.setLayout(grille);

		int totalgrille = grille.getColumns() + grille.getRows();

		for(int i = 1; i <= totalgrille; i++){
			this.add(new JButton("test" + i));
		}

		grille.setHgap(20);
		grille.setVgap(20);



	}
}
