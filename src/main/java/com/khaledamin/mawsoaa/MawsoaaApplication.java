package com.khaledamin.mawsoaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MawsoaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MawsoaaApplication.class, args);
	}

}
