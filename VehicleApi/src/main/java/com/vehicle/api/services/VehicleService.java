package com.vehicle.api.services;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.vehicle.api.models.Vehicle;

@Service
public class VehicleService {

	@Async
	public CompletableFuture<Vehicle> createVehicle(Vehicle vehicle) {

		vehicle.setVid(UUID.randomUUID().toString());
		System.out.println("vehicle in console: " + vehicle);
		return CompletableFuture.completedFuture(vehicle);
	}
}
