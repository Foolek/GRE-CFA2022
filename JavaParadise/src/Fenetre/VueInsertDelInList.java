package Fenetre;

import javax.swing.JComponent;
import javax.swing.JFrame;

import ListCtrl;

public class VueInsertDelInList extends JFrame {
	private static final long serialVersionUID = 4102367441428831564L;

	public VueInsertDelInList() {
		super("Liste des villes");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// create and set up the content pane
		JComponent newContentPane = new ListCtrl();
		newContentPane.setOpaque(true); // content panes must be opaque
		this.setContentPane(newContentPane);

		// display the window.
		this.setSize(310, 360);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

}
