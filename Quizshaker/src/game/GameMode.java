package game;

import game.Player;
import game.ScoreHandler;
import game.Timer;
import game.QuestionHandler;

public class GameMode {
	
	private static ScoreHandler sh = ScoreHandler.getInstance();
	
	public static Player[] players;
	public Timer timer = new Timer();
	public QuestionHandler qh = new QuestionHandler(); 
	
	public GameMode(Player[] pl){
		GameMode.players = pl;
	}
	
	/**
	 * Used to update scores after each round. 
	 * 		  
	 * @param p - Array of 'player'
	 * @param scores Array of int
	 */
	final protected void setPlayerScore(int[] scores){
		for(int i = 0; i < players.length; i++) {
			sh.update_score(players[i], scores[i]);
		}
	}
	/**
	 * get the current Player Score
	 * @param i - id of the player
	 * @return int - score of the player
	 */
	final public int getPlayerScore(int i){
		return sh.getScore(players[i]);
	}
	
	final public void startGameModePerID(int id) {
		
		switch(id) {
			case 1: {
				GameModeSimple gms = new GameModeSimple();
				gms.start();
			}
			default: {
				System.out.println("No GameMode specified!");
			}
		}
		//start game mode
	}
	/**
	 * Needs to be overwritten by the extending gamemode
	 */
	public void start() {
		
	}
}
