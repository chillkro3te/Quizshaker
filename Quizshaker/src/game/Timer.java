package game;
/**
 * Timer Class. Can be used for limiting answering time etc.. 
 * @author hendrik
 *
 */
public class Timer {
	
	private long start;
	private long stop;
	private boolean isRunning = false;
	
	public Timer(){
		
	}
	
	public void start(){
		this.start = System.currentTimeMillis();
		this.isRunning = true;
	}
	
	public void stop(){
		this.stop = System.currentTimeMillis();
		this.isRunning = false;
	}
	/**
	 * get the time in sec
	 * @return long - time in sec
	 */
	public long getTimeInSec(){
		
		long time;
		
		if(isRunning){
			time = ((System.currentTimeMillis() - start)/1000);
		} else {
			time = ((stop - start) / 1000);
		}
		return time;
	}
	
}
