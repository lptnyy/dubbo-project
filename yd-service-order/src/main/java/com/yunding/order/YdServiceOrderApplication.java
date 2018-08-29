package com.yunding.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yunding.mapper")
@EnableTransactionManagement
public class YdServiceOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YdServiceOrderApplication.class, args);
	}
}
