package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

public class StartGUI {

	private final static GuiSettingsDummy settings = new GuiSettingsDummy();
	
	/**
	 * Launch GUI as thread
	 */
	
	public static void start(){
//		final GuiSettingsDummy settings = new GuiSettingsDummy();
		settings.setCenterX(0);
		settings.setCenterY(0);
		settings.setResW(1024);
		settings.setResH(768);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame(settings.getCenterX(),
													settings.getCenterY(),
													settings.getResW(),
													settings.getResH());
					/**Vollbild-Modus*/
					frame.setUndecorated(true);
					frame.setLocationByPlatform(true);
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setBounds(0, 0, screenSize.width, screenSize.height);
					frame.setResizable(false);
					/***/
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
