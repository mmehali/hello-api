package com.javainuse.swaggertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}

//http://localhost:8080/hello-api/v2/api-docs
//http://localhost:8080/hello-api.swagger-ui.html