package com.vehicle.api.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.vehicle.api.models.Vehicle;

@Aspect
@Component
public class VehicleServiceAspect {

	@Before(value = "execution(* com.vehicle.api.services.VehicleService.*(..)) and args(vehicle)")
	public void beforeAdvice(JoinPoint joinPoint, Vehicle vehicle) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Vehicle (AOP Logging): " + vehicle);
	}

	@After(value = "execution(* com.vehicle.api.services.VehicleService.*(..)) and args(vehicle)")
	public void afterAdvice(JoinPoint joinPoint, Vehicle vehicle) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Vehicle (AOP Logging): " + vehicle);
	}
}
