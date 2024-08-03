package com.ggogono3.learnspringframework;

import com.ggogono3.learn_spring_framework.game.GameRunner;
import com.ggogono3.learn_spring_framework.game.IGamingConsole;
import com.ggogono3.learn_spring_framework.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		IGamingConsole game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		// system out
	}

}
