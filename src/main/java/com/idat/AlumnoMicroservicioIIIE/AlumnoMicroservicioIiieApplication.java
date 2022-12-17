package com.idat.AlumnoMicroservicioIIIE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AlumnoMicroservicioIiieApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnoMicroservicioIiieApplication.class, args);
	}

}
