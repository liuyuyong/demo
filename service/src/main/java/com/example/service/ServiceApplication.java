package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * liu
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceApplication {
	/**
	 * liu
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
