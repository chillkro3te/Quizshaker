package GUI;

import java.awt.EventQueue;

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
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
