package com.banquito.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.banquito.core.cuentas.cliente")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
