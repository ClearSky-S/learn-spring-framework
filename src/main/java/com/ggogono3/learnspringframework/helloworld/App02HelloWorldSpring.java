package com.ggogono3.learnspringframework.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ggogono3.learn_spring_framework.game.GameRunner;
import com.ggogono3.learn_spring_framework.game.IGamingConsole;
import com.ggogono3.learn_spring_framework.game.MarioGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			System.out.println(context.getBean("name"));
		}
		catch (BeansException e)
		{
			e.printStackTrace();
		}
	}

}
