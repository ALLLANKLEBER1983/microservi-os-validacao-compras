package com.compras;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class ComprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComprasApplication.class, args);
	}

}
