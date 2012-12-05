package game;
/**
 * Basic class for handling all score related operations
 * @author hendrik
 *
 */
import game.player;

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
	/**
	 * update_score is used to update players scores.
	 * @param player object and score count
	 */
	public void update_score(player id, int score){
		id.setScore(score);
	}
	/**
	 * Returns the score
	 * @param id
	 * @return int score
	 */
	public int getScore(player id){
		return id.getScore();
	}
	
}
