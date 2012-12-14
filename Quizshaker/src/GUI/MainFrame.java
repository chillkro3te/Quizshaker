package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	/**Panels*/
	private JPanel contentPane;
	private JPanel mainMenu;
	

	/**
	 * Creating the frame, starting-Coordinates and Dimension must be given.
	 */
	public MainFrame(int x, int y, int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.BLUE);
		contentPane.setSize(width, height);
		setContentPane(contentPane);
		mainMenu = new MainMenu(contentPane);
		contentPane.add(mainMenu);
	}
}
