package com.learn.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.learn.vehicle.model.Vehicle;

public interface VehicleDao {

	public  void addVehicle(Vehicle v) throws ParseException;
	public List<Vehicle> getVehicle();
	public List<Vehicle> getAdminVehicle();
	public List<Vehicle> getInsuranceExpiryDateVehicle();
	public List<Vehicle> getServiceDueDateVehicle();
	public void modifyVehice(Vehicle vehicle) throws ParseException;
	public Vehicle getEditVehicle(String vehicleNumber);
	public void deleteVehicle(String vehicleNumber);
	public List<Vehicle> sortVehicleList(String sort); 
	public List<Vehicle> getUserSearchVehicle();
	public void nextAvalibleDate(Vehicle vehicle);
	public List<Vehicle> getByVehicleName(String name);
	public List<Vehicle> getByVehicleNumber(String vehicleNumber);
	public List<Vehicle> getByVehicleColor(String color);
	public List<Vehicle> getByVehicleType(String type);
	public List<Vehicle> getByVehicleCapacity(long capacity);	
	public List<Vehicle> getBySortVehicleName(String name);
	
}
