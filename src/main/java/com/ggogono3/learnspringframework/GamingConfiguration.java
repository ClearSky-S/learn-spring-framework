package com.ggogono3.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ggogono3.learn_spring_framework.game.*;

@Configuration
public class GamingConfiguration {
	@Bean
	public IGamingConsole game() {
		return new MarioGame();
	}
	
	@Bean
	@Primary
	public GameRunner gameRunner(IGamingConsole game) {
		return new GameRunner(game);
	}
}
