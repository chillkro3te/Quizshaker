package game;

/**
 * Holds the basic player object. 
 * @author hendrik
 *
 */
public class player {
	
		private int id;
		private int score;
		
	
		public player(int id){
			this.id = id;
			this.score = 0;
		}


		public int getId() {
			return id;
		}


		public int getScore() {
			return score;
		}


		public void setScore(int score) {
			this.score = score;
		}
				
}
