package Fenetre;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuShowCity extends JFrame {
	private static final long serialVersionUID = 2989801806890302228L;

	// private String query = "SELECT * FROM ville";

	private String columns[] = { "ID", "Ville" };
	private String data[][] = new String[8][2];

	public MenuShowCity() {
		super("Liste des villes");

		DefaultTableModel model = new DefaultTableModel(data, columns);
		JTable table = new JTable(model);
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		JScrollPane pane = new JScrollPane(table);
		JFrame f = new JFrame("Ville");
		JPanel panel = new JPanel();
		panel.add(pane);
		f.add(panel);
		f.setSize(500, 250);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		// ResultSet res = stm.executeQuery(query);

		// String columns[] = { "ID", "Ville" };

	}

}
