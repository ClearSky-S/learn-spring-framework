package com.ggogono3.learnspringframework;

import com.ggogono3.learn_spring_framework.game.GameRunner;
import com.ggogono3.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		// system out
		

	}

}
