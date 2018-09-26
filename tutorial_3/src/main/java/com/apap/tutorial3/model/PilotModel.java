package com.apap.tutorial3.model;

public class PilotModel {
	private String id;
	private String licenseNumber;
	private String name;
	public int flyHour;
	
	public PilotModel(String id, String licenseNumber, String name, int flyhour) {
		super();
		this.id = id;
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.flyHour = flyhour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlyhour() {
		return flyHour;
	}

	public void setFlyhour(int flyhour) {
		this.flyHour = flyhour;
	}
}
