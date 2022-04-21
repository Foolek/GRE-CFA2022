package Fenetre;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import LireIdentInFile;

public class IdentifyUser extends JFrame {
	private static final long serialVersionUID = -5855548063414162219L;

	// ici, tt les élements qui vont apparaitre sur la fenetre
	private JLabel labelID = new JLabel("Identifiant : ");
	private JTextField id = new JTextField(15);
	private JLabel label = new JLabel("Mot de passe : ");
	private JPasswordField mdp = new JPasswordField(15);
	private JButton btnSubmit = new JButton("OK");
	private JButton btnCancel = new JButton("Annuler");

	public IdentifyUser() {
		super("Identification");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 180);
		this.setLocationRelativeTo(null);
		initListener();

		// panel auquel on va ajouter deux panel diff, top et bot
		JPanel rootPanel = new JPanel(new BorderLayout());
		
		GridBagConstraints labelConstraints = buildLabelConstraints();
		GridBagConstraints fieldConstraints = buildFieldConstraints();

		// top qui contient label 'mdp' et le champs pour entrer le mdp
		JPanel topPanel = new JPanel(new GridBagLayout());
		topPanel.add(labelID, labelConstraints);
		topPanel.add(id, fieldConstraints);
		incrementConstraintsGridY(labelConstraints, fieldConstraints);
		
		topPanel.add(label, labelConstraints);
		topPanel.add(mdp, fieldConstraints);

		// bot qui contient les btn ok et cancel
		JPanel botPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		botPanel.add(btnSubmit);
		botPanel.add(btnCancel);

		// affichage
		rootPanel.add(topPanel, BorderLayout.NORTH);
		rootPanel.add(botPanel, BorderLayout.SOUTH);

		// LireIdentInFile l = new LireIdentInFile();
		// Utilisateur user = l.Lire("marleyb", "marleyb123");

		this.setContentPane(rootPanel);
		this.setVisible(true);
	}
	
	private void incrementConstraintsGridY(GridBagConstraints labelConstraints, GridBagConstraints fieldConstraints) {
		labelConstraints.gridy++;
		fieldConstraints.gridy++;
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

	public void initListener() {
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String ident = id.getText();
				String password = mdp.getText();

				LireIdentInFile l = new LireIdentInFile();
				
				if (l.Lire(ident, password) != null) {
					new MainMenu();
					IdentifyUser.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Identifiant ou mot de passe incorrect", "Connexion impossible", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				IdentifyUser.this.dispose();
				System.exit(0);
			}
		});
	}

}
