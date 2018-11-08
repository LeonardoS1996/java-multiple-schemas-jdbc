package com.javamultipleschemasjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaMultipleSchemasJdbcApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaMultipleSchemasJdbcApplication.class, args);
	}
}
