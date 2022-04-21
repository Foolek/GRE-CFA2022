package Fenetre;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import PlaceDao;
import TripDao;
import Place;
import Trip;
import DaoFactory;

public class AddTripFen extends JFrame {
	private static final long serialVersionUID = 3764721825666331276L;

	private JComboBox<Place> departureComboBox;
	private JComboBox<Place> destinationComboBox;
	private JTextField priceField;
	private JButton tripSubmit;
	private JButton tripCancel;
	private PlaceDao placeDao;
	private TripDao tripDao;

	public AddTripFen() {
		placeDao = DaoFactory.getDaoFactory(1).getPlaceDao();
		tripDao = DaoFactory.getDaoFactory(1).getTripDao();
		init();
	}

	private void init() {
		List<Place> places = placeDao.findAllPlaces();
		departureComboBox = new JComboBox<>(new PlaceComboBoxModel(places));
		destinationComboBox = new JComboBox<>(new PlaceComboBoxModel(places));
		priceField = new JTextField();
		priceField.setPreferredSize(new Dimension(60, (int) priceField.getPreferredSize().getHeight()));
		tripSubmit = new JButton("Add trip");
		tripCancel = new JButton("Cancel");
		initListeners();

		JPanel rootPane = new JPanel(new BorderLayout());
		JPanel topPanel = new JPanel(new GridBagLayout());

		GridBagConstraints labelConstraints = buildLabelConstraints();
		GridBagConstraints fieldConstraints = buildFieldConstraints();
		GridBagConstraints comboBoxConstraints = buildComboBoxConstraints();

		JLabel fromLabel = new JLabel("From: ");
		topPanel.add(fromLabel, labelConstraints);
		topPanel.add(departureComboBox, comboBoxConstraints);

		incrementConstraintsGridY(labelConstraints, fieldConstraints, comboBoxConstraints);

		JLabel toLabel = new JLabel("To: ");
		topPanel.add(toLabel, labelConstraints);
		topPanel.add(destinationComboBox, comboBoxConstraints);

		incrementConstraintsGridY(labelConstraints, fieldConstraints, comboBoxConstraints);

		JLabel priceLabel = new JLabel("Price: ");
		topPanel.add(priceLabel, labelConstraints);
		topPanel.add(priceField, fieldConstraints);

		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		bottomPanel.add(tripCancel);
		bottomPanel.add(tripSubmit);

		rootPane.add(topPanel, BorderLayout.NORTH);
		rootPane.add(bottomPanel, BorderLayout.SOUTH);

		this.setTitle("Add trip");
		this.setSize(260, 180);
		this.setMinimumSize(new Dimension(260, 120));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(rootPane);
		this.setVisible(true);
	}

	private void incrementConstraintsGridY(GridBagConstraints labelConstraints, GridBagConstraints fieldConstraints,
			GridBagConstraints comboBoxConstraints) {
		labelConstraints.gridy++;
		comboBoxConstraints.gridy++;
		fieldConstraints.gridy++;
	}

	private GridBagConstraints buildComboBoxConstraints() {
		GridBagConstraints comboBoxConstraints = new GridBagConstraints();
		comboBoxConstraints.fill = GridBagConstraints.HORIZONTAL;
		comboBoxConstraints.insets = new Insets(5, 5, 5, 5);
		comboBoxConstraints.weightx = 2;
		comboBoxConstraints.gridy = 0;
		return comboBoxConstraints;
	}

	private GridBagConstraints buildFieldConstraints() {
		GridBagConstraints fieldConstraints = new GridBagConstraints();
		fieldConstraints.anchor = GridBagConstraints.WEST;
		fieldConstraints.insets = new Insets(5, 5, 5, 5);
		fieldConstraints.gridy = 0;
		return fieldConstraints;
	}

	private GridBagConstraints buildLabelConstraints() {
		GridBagConstraints labelConstraints = new GridBagConstraints();
		labelConstraints.anchor = GridBagConstraints.EAST;
		labelConstraints.insets = new Insets(5, 5, 5, 5);
		labelConstraints.gridy = 0;
		return labelConstraints;
	}

	public void initListeners() {
		tripSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Trip trip = new Trip();
				int price = Integer.parseInt(priceField.getText());
				trip.setDepart((Place) departureComboBox.getSelectedItem());
				trip.setDestination((Place) destinationComboBox.getSelectedItem());
				trip.setPrice(price);
				int id = tripDao.createTrip(trip);
				JOptionPane.showConfirmDialog(AddTripFen.this, "Trip added into DB with ID: " + id, "Message",
						JOptionPane.DEFAULT_OPTION);
			}
		});
		tripCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddTripFen.this.dispose();
				System.exit(0);
			}
		});
	}
}