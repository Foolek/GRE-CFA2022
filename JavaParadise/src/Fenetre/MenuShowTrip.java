package Fenetre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import PlaceDao;
import TripDao;
import Place;
import DaoFactory;

public class MenuShowTrip extends JFrame {
	private static final long serialVersionUID = -5687550189913439315L;

	private String query = "SELECT depart, arrivee, prix FROM voyage";

	private static Connection CONNECTION;
	private PlaceDao placeDao;
	private TripDao tripDao;

	private String columns[] = { "Départ", "Arrivée", "Prix (€)" };
	private String data[][] = { { "Tokyo", "Rome", "254" }, { "Rome", "Tokyo", "250" } };

	public MenuShowTrip() throws ClassNotFoundException {
		super("Liste des voyages");
		placeDao = DaoFactory.getDaoFactory(1).getPlaceDao();
		tripDao = DaoFactory.getDaoFactory(1).getTripDao();

		Statement stm;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/voyage";
			CONNECTION = DriverManager.getConnection(url, "root", "");
			stm = CONNECTION.createStatement();
			rs = stm.executeQuery(query);

			while (rs.next()) {
				Place depart = placeDao.findPlaceById(rs.getInt(1));
				Place destination = placeDao.findPlaceById(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.getMessage();
		}

		DefaultTableModel model = new DefaultTableModel(data, columns);
		JTable table = new JTable(model);
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		JScrollPane pane = new JScrollPane(table);
		JFrame f = new JFrame("Voyages annoncés");
		JPanel panel = new JPanel();
		panel.add(pane);

		f.add(panel);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(480, 360);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
