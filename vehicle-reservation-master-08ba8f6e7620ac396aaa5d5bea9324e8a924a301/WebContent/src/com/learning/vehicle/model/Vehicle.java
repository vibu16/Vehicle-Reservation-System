package com.cognizant.vehicle.model;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String vehicleNumber;
	private String vehicleName;
	private String vehicleModel;
	private String color;
    private String branch;
    private Date yearOfManufacture;
    private Date insuranceExpiryDate;
    private Date lastServicedDate;
    private Date serviceDueDate;
    private String status;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	







	public Vehicle(String vehicleNumber, String vehicleName, String vehicleModel, String color, String branch,
			Date yearOfManufacture, Date insuranceExpiryDate, Date lastServicedDate, Date serviceDueDate,
			String status) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.color = color;
		this.branch = branch;
		this.yearOfManufacture = yearOfManufacture;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.lastServicedDate = lastServicedDate;
		this.serviceDueDate = serviceDueDate;
		this.status = status;
	}








	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicleNumber == null) ? 0 : vehicleNumber.hashCode());
		return result;
	}








	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (vehicleNumber == null) {
			if (other.vehicleNumber != null)
				return false;
		} else if (!vehicleNumber.equals(other.vehicleNumber))
			return false;
		return true;
	}








	public String getVehicleNumber() {
		return vehicleNumber;
	}








	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}








	public String getVehicleName() {
		return vehicleName;
	}








	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}








	public String getVehicleModel() {
		return vehicleModel;
	}








	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
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








	public Date getYearOfManufacture() {
		return yearOfManufacture;
	}








	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
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








	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d = String.format(
				"%-20s $%-20s  %-15s %-5s %-20s $%-20s %-20s $%-20s %-20s $%-20s  EDIT  DELETE" ,vehicleName,vehicleModel,vehicleNumber,color,branch, sdf.format(yearOfManufacture), sdf.format(insuranceExpiryDate), sdf.format(lastServicedDate), sdf.format(serviceDueDate),status);
		return d;
	}
	    
}
		