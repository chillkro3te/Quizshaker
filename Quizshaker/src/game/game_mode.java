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
	final protected void after_round_update(player[] p, int[] scores){
		for(int i = 0; i < p.length; i++) {
			sh.update_score(p[i], scores[i]);
		}
	}
	
	final public void startGamemodePerID(int id) {
		
		switch(id) {
			case 1: {
				
			}
			default: {
				System.out.println("No Gamemode specified!");
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
