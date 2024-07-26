package com.Redis_2_springboot.redis_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class Redis2Application {

	public static void main(String[] args) {
		SpringApplication.run(Redis2Application.class, args);
	}

}
