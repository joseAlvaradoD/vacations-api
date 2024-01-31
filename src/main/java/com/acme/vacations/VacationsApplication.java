package com.acme.vacations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableCaching
@SpringBootApplication
@EnableMongoRepositories
public class VacationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationsApplication.class, args);
	}

}
