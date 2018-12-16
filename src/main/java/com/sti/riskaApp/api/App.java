package com.sti.riskaApp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.sti.riskaApp.config.DaoSpringConfig;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.sti.riskaApp.controller"})
@EnableJpaRepositories({"com.sti.riskaApp.dao.repository"})
@EntityScan({"com.sti.riskaApp.model"})
@Import({DaoSpringConfig.class})

public class App {
	public static void main( String[] args)
	{
		SpringApplication.run(App.class, args);
	}
}
