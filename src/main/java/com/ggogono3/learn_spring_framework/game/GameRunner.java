package com.ggogono3.learn_spring_framework.game;

public class GameRunner {
	private IGamingConsole _game;
	public GameRunner(IGamingConsole game) {
		this._game = game;
	}

	public void run() {
		System.out.println("Running game: "+ _game);
		_game.up();
		_game.down();
		_game.left();
		_game.right();
	}

}
