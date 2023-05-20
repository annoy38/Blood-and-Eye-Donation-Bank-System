package com.blood.organization.bloodorganization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients
public class BloodOrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodOrganizationApplication.class, args);
	}

}
