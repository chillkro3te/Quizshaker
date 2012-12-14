package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainMenu extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JPanel titlePane = new JPanel();
	private JPanel lowerPane = new JPanel();
	private JPanel menuPane = new JPanel();
	private JPanel clientPane = new JPanel();
	
	String[][] testList = {{"Hendrik","1336"},{"Micha","1337"},{"Tony","1338"}};
	

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
		lowerPane.add(clientPanel(testList));
		
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
		menuPane.setPreferredSize(new Dimension(getWidth()/3*1,getHeight()/3*2-100));
		
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
	
	private JPanel clientPanel(String[][] clientList){
		clientPane.removeAll();
		clientPane.setLayout(new BoxLayout(clientPane, BoxLayout.Y_AXIS));
		clientPane.setBackground(null);
		clientPane.setPreferredSize(menuPane.getPreferredSize());
		

		String[] tableColumns = {"name", "ip"};

		JTable clientTable = new JTable(clientList, tableColumns);
		
		JScrollPane tablePane = new JScrollPane(clientTable);
		tablePane.setPreferredSize(new Dimension((int)clientPane.getPreferredSize().getWidth(),
				  								 (int)clientPane.getPreferredSize().getHeight()/8*7));
		
		clientPane.add(tablePane);
		
		MenuButton kick = new MenuButton("Kick Client", new Dimension((int)clientPane.getPreferredSize().getWidth(),
																	  (int)clientPane.getPreferredSize().getHeight()/8));
		
		kick.getButton().addActionListener(this);
		kick.getButton().setActionCommand("kick");
		
		clientPane.add(kick.getPanel());
		
		return clientPane;
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
		
		if (evt.getActionCommand().equals("kick")){
			// TODO Add Settings-Function here
		}
	}

}

