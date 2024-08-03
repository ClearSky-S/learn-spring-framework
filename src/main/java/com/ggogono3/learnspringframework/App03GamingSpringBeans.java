package com.ggogono3.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ggogono3.learn_spring_framework.game.GameRunner;
import com.ggogono3.learn_spring_framework.game.IGamingConsole;
import com.ggogono3.learn_spring_framework.game.MarioGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			var gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();
		}
	}
}
