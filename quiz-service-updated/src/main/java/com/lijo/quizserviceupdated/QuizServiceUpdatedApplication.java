package com.lijo.quizserviceupdated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceUpdatedApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceUpdatedApplication.class, args);
	}

}
