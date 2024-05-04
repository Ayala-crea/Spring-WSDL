package com.example.pemograman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = {"com.example.pemograman.repository","com.example.pemograman"})

public class WebserviceSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceSoapApplication.class, args);
	}

}
