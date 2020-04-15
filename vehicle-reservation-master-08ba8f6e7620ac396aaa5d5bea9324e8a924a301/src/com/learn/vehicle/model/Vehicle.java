package com.learn.vehicle.model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String vehicleNumber;
	private String name;
	private String color;
	private String branch;
	private String vehicleType;
	private Date insuranceExpiryDate;
	private Date lastServicedDate;
	private Date serviceDueDate;
	private Date nextAvailableDate;
	private int seatingCapacity;
	private Date yearOfManufacture;
	private long price;

	


	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehicleNumber, String name, String color, String branch, String vehicleType,
			Date insuranceExpiryDate, Date lastServicedDate, Date serviceDueDate, Date nextAvailableDate,
			int seatingCapacity, Date yearOfManufacture, long price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.name = name;
		this.color = color;
		this.branch = branch;
		this.vehicleType = vehicleType;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.lastServicedDate = lastServicedDate;
		this.serviceDueDate = serviceDueDate;
		this.nextAvailableDate = nextAvailableDate;
		this.seatingCapacity = seatingCapacity;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
	}

	public Vehicle(String vehicleNumber, String name, String color, String branch, String vehicleType,
			Date insuranceExpiryDate, Date lastServicedDate, Date serviceDueDate, int seatingCapacity,
			Date yearOfManufacture, long price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.name = name;
		this.color = color;
		this.branch = branch;
		this.vehicleType = vehicleType;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.lastServicedDate = lastServicedDate;
		this.serviceDueDate = serviceDueDate;
		this.seatingCapacity = seatingCapacity;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
	}
	

	public Vehicle(String vehicleNumber, Date nextAvailableDate) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.nextAvailableDate = nextAvailableDate;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getInsuranceExpiryDate() {
		return insuranceExpiryDate;
	}

	public void setInsuranceExpiryDate(Date insuranceExpiryDate) {
		this.insuranceExpiryDate = insuranceExpiryDate;
	}

	public Date getLastServicedDate() {
		return lastServicedDate;
	}

	public void setLastServicedDate(Date lastServicedDate) {
		this.lastServicedDate = lastServicedDate;
	}

	public Date getServiceDueDate() {
		return serviceDueDate;
	}

	public void setServiceDueDate(Date serviceDueDate) {
		this.serviceDueDate = serviceDueDate;
	}

	public Date getNextAvailableDate() {
		return nextAvailableDate;
	}

	public void setNextAvailableDate(Date nextAvailableDate) {
		this.nextAvailableDate = nextAvailableDate;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Date getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat box = NumberFormat.getInstance();
		box.setGroupingUsed(true);
		return String.format(vehicleNumber, name, color, branch, vehicleType, sd.format(insuranceExpiryDate),
				sd.format(lastServicedDate), sd.format(serviceDueDate), sd.format(nextAvailableDate), box.format(seatingCapacity),
				sd.format(yearOfManufacture),box.format(price));
	}

}
