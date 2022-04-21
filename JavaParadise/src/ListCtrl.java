import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListCtrl extends JPanel implements ListSelectionListener {
	private static final long serialVersionUID = -4856663039891158711L;

	private JList<Place> list;
	private DefaultListModel<Place> listModel;

	private static final String AddString = "Add";
	private static final String SuppString = "Suppr";
	private JButton supprButton, addButton;
	private JTextField txtFieldName;

	public ListCtrl() {
		super(new BorderLayout());

		// création de liste de ville
		listModel = new DefaultListModel<Place>();

		PlaceCtrl place = new PlaceCtrl(DaoFactory.getDaoFactory(1));
		listModel.addAll(place.findAllPlaces());

		list = new JList<Place>(listModel);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		JScrollPane listScrollPane = new JScrollPane(list);

		addButton = new JButton(AddString);
		addButton.addActionListener(new AddPlaceListener());

		supprButton = new JButton(SuppString);
		supprButton.addActionListener(new SuppPlaceListener());

		/*
		 * tripButton = new JButton(TripString); tripButton.addActionListener();
		 */

		// this.txtFieldName = new JTextField();
		this.txtFieldName = new JTextField();
		txtFieldName.addFocusListener(new TxtEditListener());
		// Create a panel that uses BoxLayout.
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.add(supprButton);
		buttonPane.add(Box.createHorizontalStrut(5));
		buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
		buttonPane.add(Box.createHorizontalStrut(5));
		buttonPane.add(txtFieldName);
		buttonPane.add(addButton);
		buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		add(listScrollPane, BorderLayout.CENTER);
		add(buttonPane, BorderLayout.PAGE_END);
	}

	// This method is required by ListSelectionListener.
	public void valueChanged(ListSelectionEvent e) {

		addButton.setEnabled(false);
		if (e.getValueIsAdjusting() == false) {

			if (list.getSelectedIndex() == -1) {
				// No selection, disable fire button.
				supprButton.setEnabled(false);

			} else {
				// Selection, enable the fire button.
				supprButton.setEnabled(true);
			}
		}
	}

	/* work in progress on click edit enable or disable btn Hire */
	class TxtEditListener extends FocusAdapter {

		@Override
		public void focusGained(FocusEvent e) {
			addButton.setEnabled(true);
			supprButton.setEnabled(false);
		}

	}

	// inner class
	class SuppPlaceListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int index = list.getSelectedIndex();
			Place placeToDelete = listModel.remove(index);

			PlaceCtrl place = new PlaceCtrl(DaoFactory.getDaoFactory(1));
			place.removePlace(placeToDelete);

			int size = listModel.getSize();
			if (size == 0) { // Nobody's left, disable firing.
				supprButton.setEnabled(false);

			} else { // Select an index.
				if (index == listModel.getSize()) {
					// removed item in last position
					index--;
				}

				list.setSelectedIndex(index);
				list.ensureIndexIsVisible(index);
			}
		}
	}

	// inner class
	// This listener is shared by the text field and the hire button.
	class AddPlaceListener implements ActionListener {
		public static final int MYSQL = 1;

		// Required by ActionListener.
		public void actionPerformed(ActionEvent e) {

			String name = txtFieldName.getText();
			boolean b_name = txtFieldName.getText().isEmpty();

			if (b_name == true) {
				JOptionPane.showMessageDialog(null, "Saisie obligatoire !", "Erreur", JOptionPane.ERROR_MESSAGE);
				txtFieldName.requestFocusInWindow();
				return;
			}

			int index = list.getSelectedIndex(); // get selected index
			if (index == -1) { // no selection, so insert at beginning
				index = 0;
			} else { // add after the selected item
				index++;
			}

			Place ville = new Place(name);
			listModel.addElement(ville);
			// insertion dans la base de donnée

			PlaceCtrl place = new PlaceCtrl(DaoFactory.getDaoFactory(1));
			place.addPlace(name);

			// Reset the text field.
			// txtFieldName.requestFocusInWindow();
			txtFieldName.setText("");

			// Select the new item and make it visible.
			list.setSelectedIndex(index);
			list.ensureIndexIsVisible(index);
		}

	}

}
