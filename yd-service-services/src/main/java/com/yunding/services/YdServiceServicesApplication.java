package com.yunding.services;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yunding.mapper")
@EnableTransactionManagement
public class YdServiceServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(YdServiceServicesApplication.class, args);
	}
}
