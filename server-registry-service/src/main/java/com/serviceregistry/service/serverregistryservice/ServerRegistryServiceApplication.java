package com.serviceregistry.service.serverregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegistryServiceApplication.class, args);
	}

}
