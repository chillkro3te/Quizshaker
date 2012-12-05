package game;

import game.player;
import game.score_handler;

public class game_mode {
	
	private static score_handler sh = score_handler.getInstance();
	public static player[] players;
	
	public game_mode(player[] pl){
		game_mode.players = pl;
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
