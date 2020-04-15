package com.cognizant.vehicle.dao;

import java.sql.SQLException;

import com.cognizant.vehicle.model.Vehicle;


public interface AddVehicleDao {
	 public void addVehicle(Vehicle vehicle) throws SQLException;
}
