package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JPanel contentPane;

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
		mainScreen();
	}
	
	public void mainScreen(){
		contentPane.removeAll();
		
		getContentPane().setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		
		/**Title - will be reworked as soon a proper title-art is available.*/
		JPanel titlePane = new JPanel();
		title(titlePane);
		/***/
		
		/**"second, lower Part of mainScreen*/
		JPanel lowerPane = new JPanel();
		lowerPane.setLayout(new FlowLayout(FlowLayout.CENTER, contentPane.getWidth()/10, 0));
		lowerPane.setBackground(null);
		
		/**adding Panels to lowerPane*/
		mainMenu(lowerPane);
		profilePane(lowerPane);
		
		contentPane.add(titlePane);
		contentPane.add(lowerPane);
		
	}
	/**Initializing of TitlePanel to building it into given JPanel
	 * needs to be reworked at some point (Title-Art)*/	
	private void title(JPanel destPane){
		destPane.setLayout(new BoxLayout(destPane, BoxLayout.X_AXIS));
		destPane.setPreferredSize(new Dimension(contentPane.getWidth(),contentPane.getHeight()/3));
		JLabel titleLabel = new JLabel("QUIZSHAKER", JLabel.CENTER);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
		destPane.add(titleLabel);
		destPane.setBackground(null);
	}
	
	
	
	/**Initializing of Mainmenu to building it into given JPanel*/	
	private void mainMenu(JPanel destPane){
		JPanel menuPane = new JPanel();
		menuPane.setLayout(new BoxLayout(menuPane, BoxLayout.Y_AXIS));
		menuPane.setBackground(null);
		menuPane.setPreferredSize(new Dimension(contentPane.getWidth()/3*1,contentPane.getHeight()/3*2));
		
		/**Buttons*/
		Dimension buttonDim = menuPane.getPreferredSize();
		buttonDim.height = buttonDim.height/4;
		MenuButton play = new MenuButton("Play", buttonDim);
		MenuButton settings = new MenuButton("Settings", buttonDim);
		MenuButton exit = new MenuButton("Exit", buttonDim);
		
		menuPane.add(play.getPanel());
		menuPane.add(settings.getPanel());
		menuPane.add(exit.getPanel());
		
		destPane.add(menuPane);
	}
	
	/**Initializing of Profile to building it into given JPanel*/	
	private void profilePane(JPanel destPane){
		JPanel profilePane = new JPanel();
		
		profilePane.setLayout(new BoxLayout(profilePane, BoxLayout.Y_AXIS));
		profilePane.setBackground(Color.WHITE);
		profilePane.setPreferredSize(new Dimension(contentPane.getWidth()/3*1,contentPane.getHeight()/3*2-10));
		
		JLabel dummy = new JLabel("PLAYER_PROFILE");
		profilePane.add(dummy);
		
		destPane.add(profilePane);
	}

}
