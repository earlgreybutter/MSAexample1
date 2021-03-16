package com.butter.earlgrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EarlgreyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarlgreyApplication.class, args);
	}

}
