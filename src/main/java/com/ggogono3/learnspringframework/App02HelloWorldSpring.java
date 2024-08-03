package com.ggogono3.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ggogono3.learn_spring_framework.game.GameRunner;
import com.ggogono3.learn_spring_framework.game.IGamingConsole;
import com.ggogono3.learn_spring_framework.game.MarioGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
	}

}
