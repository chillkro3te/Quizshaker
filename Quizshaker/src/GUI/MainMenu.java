package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JPanel titlePane = new JPanel();
	private JPanel lowerPane = new JPanel();
	private JPanel menuPane = new JPanel();
	private JPanel profilePane = new JPanel();
	private JPanel logInPane = new JPanel();

	public MainMenu(JPanel destPane){
		setBackground(null);
		setSize(destPane.getSize());
		
		start();
	}
	
	public void start(){
		removeAll();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		/**Title - will be reworked as soon a proper title-art is available.*/
		title(titlePane);
		/***/
		
		
		/**"second, lower Part of mainScreen*/
		lowerPane.setLayout(new FlowLayout(FlowLayout.CENTER, getWidth()/10, 0));
		lowerPane.setBackground(null);
		
		/**adding Panels to lowerPane*/
		lowerPane.add(mainMenu());
		lowerPane.add(logInPanel());
		
		add(titlePane);
		add(lowerPane);
	}
	
	
	/**Initializing of TitlePanel to building it into given JPanel
	 * needs to be reworked at some point (Title-Art)*/	
	private void title(JPanel destPane){
		destPane.setLayout(new BoxLayout(destPane, BoxLayout.X_AXIS));
		destPane.setPreferredSize(new Dimension(getWidth(),getHeight()/3));
		JLabel titleLabel = new JLabel("QUIZSHAKER", JLabel.CENTER);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
		destPane.add(titleLabel);
		destPane.setBackground(null);
	}
	
	
	
	/**Initializing of Mainmenu to building it into given JPanel*/	
	private JPanel mainMenu(){
		menuPane.setLayout(new BoxLayout(menuPane, BoxLayout.Y_AXIS));
		menuPane.setBackground(null);
		menuPane.setPreferredSize(new Dimension(getWidth()/3*1,getHeight()/3*2));
		
		/**Buttons*/
		Dimension buttonDim = menuPane.getPreferredSize();
		buttonDim.height = buttonDim.height/6;
		
		MenuButton play = new MenuButton("Play", buttonDim);
		MenuButton createQ = new MenuButton("Create Question", buttonDim);
		MenuButton settings = new MenuButton("Settings", buttonDim);
		MenuButton exit = new MenuButton("Exit", buttonDim);
		
		play.getButton().addActionListener(this);
		play.getButton().setActionCommand("play");
		createQ.getButton().addActionListener(this);
		createQ.getButton().setActionCommand("createQ");
		settings.getButton().addActionListener(this);
		settings.getButton().setActionCommand("settings");
		exit.getButton().addActionListener(this);
		exit.getButton().setActionCommand("exit");
		/***/
		
		menuPane.add(play.getPanel());
		menuPane.add(createQ.getPanel());
		menuPane.add(settings.getPanel());
		menuPane.add(exit.getPanel());
		
		return menuPane;
	}
	
	/**Initializing of Profile to building it into given JPanel*/	
	private JPanel profilePanel(){
		profilePane.removeAll();
		profilePane.setLayout(new BoxLayout(profilePane, BoxLayout.Y_AXIS));
		profilePane.setBackground(null);
		profilePane.setPreferredSize(logInPane.getPreferredSize());
		Dimension buttonDim = profilePane.getPreferredSize();
		buttonDim.height = buttonDim.height/6;
		
		/**Case: Profile is loggedIn*/
		JPanel profile = new JPanel();
		Dimension profileDim = profilePane.getPreferredSize();
		profileDim.height = profileDim.height/3*2;
		profile.setPreferredSize(profileDim);
		JLabel dummy = new JLabel("PLAYER_PROFILE");
		profile.add(dummy);
		
		MenuButton logout = new MenuButton("Logout", buttonDim);
		logout.getButton().addActionListener(this);
		logout.getButton().setActionCommand("logout");
		
		profilePane.add(profile);
		profilePane.add(logout.getPanel());
			
		return profilePane;
	}
	
	private JPanel logInPanel(){
		logInPane.removeAll();
		logInPane.setLayout(new BoxLayout(logInPane, BoxLayout.Y_AXIS));
		logInPane.setBackground(null);
		logInPane.setPreferredSize(new Dimension(getWidth()/3*1,getHeight()/3*2));
		Dimension buttonDim = logInPane.getPreferredSize();
		buttonDim.height = buttonDim.height/6;
		
		/**Case: NO profile is loggedIn*/
		
		MenuButton login = new MenuButton("Login", buttonDim);
		login.getButton().addActionListener(this);
		login.getButton().setActionCommand("login");
		
		MenuButton createP = new MenuButton("Create Profile", buttonDim);
		createP.getButton().addActionListener(this);
		createP.getButton().setActionCommand("createP");
		
		login.getPanel().add(createP.getButton());
		logInPane.add(login.getPanel());
		
		return logInPane;
	}

	/**ActionListener, implement Functions in noted spots*/
	public void actionPerformed(ActionEvent evt) {
		/**Mainmenu-Buttons*/
		if (evt.getActionCommand().equals("start")){
			// TODO Add Gamestart-Function here
		}
		if (evt.getActionCommand().equals("createQ")){
			// TODO Add Create-Function here
		}
		if (evt.getActionCommand().equals("settings")){
			// TODO Add Settings-Function here
		}
		if (evt.getActionCommand().equals("exit")){
			// TODO Add Exit-Function here, implemented is dummy so far
			System.exit(0);
		}
		/**Profile-Buttons*/
		if (evt.getActionCommand().equals("logout")){
			// TODO Add Logout-Function here
			lowerPane.remove(profilePane);
			lowerPane.add(logInPanel());
			lowerPane.validate();
			lowerPane.repaint();	
		}
		if (evt.getActionCommand().equals("login")){
			// TODO Add Login-Function here
			lowerPane.remove(logInPane);
			lowerPane.add(profilePanel());
			lowerPane.validate();
			lowerPane.repaint();
		}
		if (evt.getActionCommand().equals("createP")){
			// TODO Add Exit-Function here, implemented is dummy so far
		}
	}

}

