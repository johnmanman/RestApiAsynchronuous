package com.vehicle.api.customvalidators;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VehicleTransmissionTypeValidator implements ConstraintValidator<VehicleTransmissionType, String> {

	List<String> transmissionType = Arrays.asList("MANUAL", "AUTO");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return transmissionType.contains(value);
	}
}
