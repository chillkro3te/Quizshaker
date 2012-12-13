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
		settings.setFullscreen(true);
		if(settings.isFullscreen()){
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			settings.setResW(screenSize.width);
			settings.setResH(screenSize.height);
		}else{
		settings.setResW(1024);
		settings.setResH(768);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame(settings.getCenterX(),
													settings.getCenterY(),
													settings.getResW(),
													settings.getResH());
					
					if(settings.isFullscreen())
						frame.setUndecorated(true);
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
