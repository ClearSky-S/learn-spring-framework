package com.ggogono3.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Ranga";
	}
}
