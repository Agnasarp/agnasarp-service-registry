package com.agnasarp.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AgnasarpServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgnasarpServiceRegistryApplication.class, args);
	}

}
