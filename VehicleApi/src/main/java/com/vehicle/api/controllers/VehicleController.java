package com.vehicle.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.api.models.Vehicle;
import com.vehicle.api.services.VehicleService;

@RestController
@RequestMapping("/vehicle-api/v1/vehicles")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping(value = "/vehicle")
	public ResponseEntity<?> createVehicle(@Valid @RequestBody Vehicle vehicle, BindingResult bindingResult) 
			throws InterruptedException, ExecutionException {
		
		if (bindingResult.hasErrors()) {
			Map<String, String> errorMap = new HashMap();
			for (FieldError fieldError : bindingResult.getFieldErrors()) {
				errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
				return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<List<FieldError>>(HttpStatus.BAD_REQUEST);
		}

		HttpHeaders headers = new HttpHeaders();

		CompletableFuture<Vehicle> createdVehicle = this.vehicleService.createVehicle(vehicle);
		String vid = createdVehicle.get().getVid();
		headers.add("vid", vid);
		headers.add("Content-Type", "application/json");
		return new ResponseEntity<>(headers, HttpStatus.OK);
	}

}
