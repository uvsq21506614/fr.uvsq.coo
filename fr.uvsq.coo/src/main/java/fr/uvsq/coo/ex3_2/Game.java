package fr.uvsq.coo.ex3_2;

public class Game {
	private int score=0;

	public Game() {
		// TODO Auto-generated constructor stub
	}

	public void roll(int pins){
		score +=pins;
				
	}
	
	public int score(){
		
		return score;
	}
	
}
