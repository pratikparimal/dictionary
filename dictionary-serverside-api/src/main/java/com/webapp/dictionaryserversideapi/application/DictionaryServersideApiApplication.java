package com.webapp.dictionaryserversideapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
public class DictionaryServersideApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DictionaryServersideApiApplication.class, args);
	}

}
