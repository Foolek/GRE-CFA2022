package fenetre;

import javax.swing.*;
import java.awt.*;

public class fenetre1 extends JFrame {

	private panel1 pan = new panel1();

	public fenetre1() {
		setVisible(true);
		setTitle("Fenetre1");
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(600,550));
		setSize(1200,1100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(pan);



	}
}
