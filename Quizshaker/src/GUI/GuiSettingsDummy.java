package GUI;

public class GuiSettingsDummy {

	/**
	 * Dummy-Class to test first Settings, will probably be reworked/improved/rewritten
	 */
	
	
	/**
	 * Setting-Parameters for GUI	
	 */
	private boolean fullscreen;
	private int resW, resH;
	private int centerX, centerY;
	
	
//	public GuiSettingsDummy(boolean fullscreen, short resW, short resH, int centerX, int centerY){
//		
//	}
	
	/**
	 * get-/set-methods
	 * @return
	 */
	public boolean isFullscreen() {
		return fullscreen;
	}
	
	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}
	
	
	public int getResW() {
		return resW;
	}
	
	public void setResW(int resW) {
		this.resW = resW;
	}
	
	
	public int getResH() {
		return resH;
	}

	public void setResH(int resH) {
		this.resH = resH;
	}

	
	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	
	
	public int getCenterY() {
		return centerY;
	}
	
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
}
