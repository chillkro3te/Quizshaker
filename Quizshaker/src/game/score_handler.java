package game;
/**
 * Basic class for handling all score related operations
 * @author hendrik
 *
 */
public class score_handler {
	private static score_handler instance;
	
	private score_handler() {
	}
	
	public synchronized static score_handler getInstance(){
		if(instance == null){
			instance = new score_handler();
		}
		return instance;
	}
	
}
