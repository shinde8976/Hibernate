package com.te.meven.VehicleDTO;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	private String vehicleCompany;
	private int vehicleWheel;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleCompany() {
		return vehicleCompany;
	}
	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}
	public int getVehicleWheel() {
		return vehicleWheel;
	}
	public void setVehicleWheel(int vehicleWheel) {
		this.vehicleWheel = vehicleWheel;
	}

}
