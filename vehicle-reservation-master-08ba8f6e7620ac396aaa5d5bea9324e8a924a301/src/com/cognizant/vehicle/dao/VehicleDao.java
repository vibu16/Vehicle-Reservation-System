package com.cognizant.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.vehicle.model.Vehicle;

public interface VehicleDao {

	public List<Vehicle> getViewVehicleAdmin() throws Exception;
	public void modifyVehice(Vehicle vehicle);
	public Vehicle getVehicle(String vehicleNo);
	public void removeVehicle(String vehicleNo) throws Exception ;


	
    public List<Vehicle> getAdminViewVehicles();
	
	public List<Vehicle> getUserViewVehicles();
	
	public  void addVehicle(Vehicle v) throws ParseException;
	
	

}
