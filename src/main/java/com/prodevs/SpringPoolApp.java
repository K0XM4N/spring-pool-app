package com.prodevs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;
import java.sql.Date;

@SpringBootApplication
public class SpringPoolApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringPoolApp.class, args);
	}

	@Bean
	public Validator validator(){
		return new LocalValidatorFactoryBean();
	}
}
