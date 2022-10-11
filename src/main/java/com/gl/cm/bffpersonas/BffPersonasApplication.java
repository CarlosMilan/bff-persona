package com.gl.cm.bffpersonas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffPersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffPersonasApplication.class, args);
	}

}
