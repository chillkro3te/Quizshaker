package game;
/**
 * ID = 1
 * Simple basic game mode - Some Questions, some Points
 * 
 * @author hendrik
 *
 */
public class GameModeSimple extends GameMode {
	
	private int AnsweringTime = 10;
	private int ScorePerQuestion = 100;
	private int QuestionsAsked = 5;
	
	public GameModeSimple() {
		super(players);
	}
	
	public void start() {
		
		for(int i = 0; i < QuestionsAsked; i++){
			qh.getNextQuestion();
			
			timer.start();
			while(AnsweringTime != timer.getTimeInSec()){
				//let the people answer the question
			}
			timer.stop();
			
		}			
	}
}
