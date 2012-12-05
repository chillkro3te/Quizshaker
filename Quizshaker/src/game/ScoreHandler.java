package game;
/**
 * Basic class for handling all score related operations
 * @author hendrik
 *
 */
import game.Player;

public class ScoreHandler {
	private static ScoreHandler instance;
	
	private ScoreHandler() {
	}
	
	public synchronized static ScoreHandler getInstance(){
		if(instance == null){
			instance = new ScoreHandler();
		}
		return instance;
	}
	/**
	 * update_score is used to update players scores.
	 * @param player object and score count
	 */
	public void update_score(Player id, int score){
		id.setScore(score);
	}
	/**
	 * Returns the score
	 * @param id
	 * @return int score
	 */
	public int getScore(Player id){
		return id.getScore();
	}
	
}
