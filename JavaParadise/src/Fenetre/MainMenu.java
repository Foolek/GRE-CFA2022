package Fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenu extends JFrame {
	private static final long serialVersionUID = -4266621131006468488L;

	private String btnGestion = "Gestion", btnAfficher = "Afficher";
	private String btnVille = "Ville", btnVoyage = "Voyage", btnVilleDispo = "Villes enregistr�s",
			btnVoyageDispo = "Voyages disponibles";

	public MainMenu() {
		super("Agence TimeTravel");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(290, 300);
		this.setLocationRelativeTo(null);

		JMenuBar mb = new JMenuBar();
		this.setJMenuBar(mb); // barre de menu s'ajoute � la JFrame
		JMenu m1 = new JMenu(btnGestion); // cr�ation menu m1
		JMenu m2 = new JMenu(btnAfficher); // cr�ation menu m2

		JMenuItem menuItemAdd = new JMenuItem(btnVille);
		JMenuItem menuItemTrip = new JMenuItem(btnVoyage);
		JMenuItem menuAffichePlace = new JMenuItem(btnVilleDispo);
		JMenuItem menuAfficheTrip = new JMenuItem(btnVoyageDispo);

		mb.add(m1); // ajout du menu � la barre de menu
		// ajout des sous-menus
		m1.add(menuItemAdd);
		m1.addSeparator();
		m1.add(menuItemTrip);

		mb.add(m2); // ajout du menu � la barre de menu
		// ajout des sous-menus
		m2.add(menuAffichePlace);
		m2.addSeparator();
		m2.add(menuAfficheTrip);

		afficherMenuListener listener = new afficherMenuListener();
		menuItemAdd.addActionListener(listener);
		menuItemTrip.addActionListener(listener);
		menuAffichePlace.addActionListener(listener);
		menuAfficheTrip.addActionListener(listener);

		this.setVisible(true);

	}// fin constructeur menu

	class afficherMenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == btnVille) {
				new VueInsertDelInList();
			} // fin if

			if (e.getActionCommand() == btnVoyage) {
				new AddTripFen();
			} // fin if

			if (e.getActionCommand() == btnVilleDispo) {
				new MenuShowCity();
			} // fin if

			if (e.getActionCommand() == btnVoyageDispo) {
				try {
					new MenuShowTrip();
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			} // fin if

		}// fin methode

	}// fin class afficherMenuListener

}// fin class MenuPrincipal
