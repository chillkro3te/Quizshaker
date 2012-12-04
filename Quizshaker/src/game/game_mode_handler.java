package game;
import game.player;
import game.score_handler;

/**
 * game_mode_handler - used for basic game mode handling stuff.
 * new game modes should extend this class. 
 * @author hendrik
 *
 */
public class game_mode_handler {
		
		private score_handler sh = score_handler.getInstance();

		public game_mode_handler() {
			
		}
		/**
		 * Used to update scores after each round. 
		 * 		  
		 * @param p - Array of 'player'
		 * @param scores Array of int
		 */
		protected void after_round_update(player[] p, int[] scores){
			for(int i = 0; i < p.length; i++) {
				sh.update_score(p[i], scores[i]);
			}
		}
		/**
		 * Needs to be overwritten by game_modes
		 */
		public void start_game_mode(){
		
		}
}
