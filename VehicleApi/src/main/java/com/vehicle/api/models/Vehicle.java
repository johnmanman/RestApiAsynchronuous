package com.vehicle.api.models;

import java.io.Serializable;

import com.vehicle.api.customvalidators.VehicleTransmissionType;

public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	private String vid;
	private String vin;
	private Long year;
	private String make;
	private String model;

	@VehicleTransmissionType
	private String transmissionType;

	public Vehicle() {
	}

	public Vehicle(String vid, String vin, Long year, String make, String model, String transmissionType) {
		super();
		this.vid = vid;
		this.vin = vin;
		this.year = year;
		this.make = make;
		this.model = model;
		this.transmissionType = transmissionType;
	}

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vin=" + vin + ", year=" + year + ", make=" + make + ", model=" + model
				+ ", transmissionType=" + transmissionType + "]";
	}

}
