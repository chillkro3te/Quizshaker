package GUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
* Klasse, um allgemein Buttons fuer die Menues konstruieren zu koennen.
*
* @author garg
*
*/

public class MenuButton extends JPanel {
		// initialisiere Variablen
		JButton button;
		JPanel buttonPane;
		String title;

		private static final long serialVersionUID = 1L;

		// Konstruktor
		public MenuButton(String title, Dimension dim) {
				this.title = title; // deklariere title mit übergebenem title
				button = new JButton(title); // deklariere button als neuen JButton
				buttonPane = new JPanel(); // deklariere buttonPanel als neues JPanel
				buttonPane.setPreferredSize(dim);
				buttonPane.setBackground(null); // stelle Hintergrund vom buttonPanel durchsichtig	
				button.setPreferredSize(dim);
				button.setFont(new Font("Arial", Font.BOLD, 30));
				buttonPane.add(button); // füge button dem buttonPane bei
		}

		// Methode zur JPanel-Rückgabe
		public JPanel getPanel() {
				return buttonPane;
		}
		
		// Methode zur JButton-Rückgabe
		public JButton getButton() {
				return button;
		}
}
