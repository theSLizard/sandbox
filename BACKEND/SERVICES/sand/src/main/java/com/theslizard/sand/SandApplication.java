package com.theslizard.sand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SandApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandApplication.class, args);
	}

}
