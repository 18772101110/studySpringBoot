package com.scott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启缓存
public class Study08Application {

	public static void main(String[] args) {
		SpringApplication.run(Study08Application.class, args);
	}

}
