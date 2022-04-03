package com.tetris_project.git;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game myGame = new Game(); 
		
		for (int i = 0; i < 50; i++) {
			myGame.Update();
		}
		myGame.displayGridValue();
	}

}
