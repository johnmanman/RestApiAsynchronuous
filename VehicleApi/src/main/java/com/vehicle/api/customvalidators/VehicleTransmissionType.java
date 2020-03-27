package com.vehicle.api.customvalidators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = VehicleTransmissionTypeValidator.class)
@Documented
public @interface VehicleTransmissionType {

	String message() default "Transmission Type should be either MANUAL or AUTO.";

    Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};}
