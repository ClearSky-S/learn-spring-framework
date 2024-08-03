package com.ggogono3.learn_spring_framework.game;

public class GameRunner {
	private MarioGame _game;
	public GameRunner(MarioGame marioGame) {
		this._game = marioGame;
	}

	public void run() {
		System.out.println("Running game: "+ _game);
		_game.up();
		_game.down();
		_game.left();
		_game.right();
	}

}
