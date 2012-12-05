package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainFrame(int x, int y, int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.BLUE);
		contentPane.setSize(width, height);
		setContentPane(contentPane);
		mainScreen();
	}
	
	public void mainScreen(){
		contentPane.removeAll();
		
		/**
		 * Title
		 */
		JLabel title = new JLabel("QUIZSHAKER", JLabel.CENTER);
		title.setPreferredSize(new Dimension(100, 200));
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Comic Sans", Font.BOLD, 30));
		contentPane.add(title, BorderLayout.PAGE_START);
		
		/**
		 * Menu-List
		 */
		JButton start = new JButton("Start");
		JButton settings = new JButton("Settings");
		JButton exit = new JButton("Exit");
		JPanel menuList = new JPanel();
		menuList.setLayout(new BorderLayout(0, 0));
		menuList.setSize(contentPane.getWidth()/2, contentPane.getHeight()/2);
		menuList.add(start, BorderLayout.PAGE_START);
		menuList.add(settings, BorderLayout.CENTER);
		menuList.add(exit, BorderLayout.PAGE_END);
		
		
		JPanel lowerPane = new JPanel();
		lowerPane.setLayout(new FlowLayout());
		
		
		
		lowerPane.add(menuList);
		contentPane.add(lowerPane, BorderLayout.CENTER);
		
	}

}
