package fenetre;

import javax.swing.*;
import java.awt.*;
import java.sql.RowId;

public class fenetre1 extends JFrame {

	private panel1 pan = new panel1();
	private panel1 pan1 = new panel1();

	public fenetre1() {
		this.setVisible(true);
		this.setSize(800, 600);
		this.setTitle("Fenetre1");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//		this.setContentPane(pan);
		this.setVisible(true);

		this.setContentPane(pan);
		this.setContentPane(pan1);



		pan.setSize(300,300);

	}


}
