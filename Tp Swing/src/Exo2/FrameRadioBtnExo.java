package Exo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameRadioBtnExo extends JFrame implements ItemListener {

	JLabel LblPicture;
	JRadioButton birdButton, catButton;
	Icon imgIconBird, imgIconCat ;

	public FrameRadioBtnExo() {

		//Create the radio buttons.
		birdButton = new JRadioButton("Bird");
		birdButton.setSelected(true);
		catButton = new JRadioButton("Cat");

		//Group the radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(birdButton);
		group.add(catButton);

		//Register a listener for the radio buttons.
		//birdButton.addItemListener((ItemListener) mainExoBtnRadio.Myframe);
		birdButton.addItemListener(this);//this objet de type FrameRadioBtnExo de  type interface
		//la classe courante impl�mente le listener (voire diapo p.73)
		catButton.addItemListener(this);

		//les image sont transform�s en icone
		imgIconBird = new ImageIcon(FrameRadioBtnExo.class.getResource("images tp/Bird.gif"));
		imgIconCat = new ImageIcon(FrameRadioBtnExo.class.getResource("images tp/Cat.gif"));

		//par defaut l'image bird est charg�
		LblPicture = new JLabel(imgIconBird);

		//Put the radio buttons in a column in a panel.
		JPanel radioPanel = new JPanel(new GridBagLayout());//sur une seule colonne
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0; c.gridy = 0;
		c.weighty = 0.5;//espace entre les 2 radios buttons
		radioPanel.add(birdButton,c);
		c.gridy = 1;//on change de ligne
		radioPanel.add(catButton, c);

		this.add(radioPanel, BorderLayout.WEST);
		this.add(LblPicture, BorderLayout.EAST);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);


	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if ( e.getSource() == catButton)
			LblPicture.setIcon(imgIconCat);
		else
			LblPicture.setIcon(imgIconBird);

	}
}
