package com.example.logindb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginDatabaseApplication.class, args);
	}

}
