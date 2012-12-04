package game;

/**
 * Holds the basic player object. 
 * @author hendrik
 *
 */
public class player {
	
		private int id;
		private int score;
		private String name; 
		

		public player(int id, String name){
			this.id = id;
			this.score = 0;
			this.name = name;
		}
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		/**
		 * DO NOT CALL THIS FUNCTION DIRECTLY please.
		 * USE the score_handler instead.
		 * @return
		 */
		public int getScore() {
			return score;
		}


		public void setScore(int score) {
			this.score = score;
		}
				
}
