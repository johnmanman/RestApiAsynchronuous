package com.vehicle.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class VehicleApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VehicleApiApplication.class, args);
	}

}
