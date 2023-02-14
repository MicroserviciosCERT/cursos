package com.certificatic.springboot.app.articulos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootServicioArticulosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioArticulosApplication.class, args);
	}

}
