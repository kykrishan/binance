package com.alphas.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.http.RequestEntity.post;

@SpringBootApplication
public class BinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinanceApplication.class, args);
	}

}
