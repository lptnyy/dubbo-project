package com.yunding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yunding")
public class YdWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(YdWebApiApplication.class, args);
	}
}
