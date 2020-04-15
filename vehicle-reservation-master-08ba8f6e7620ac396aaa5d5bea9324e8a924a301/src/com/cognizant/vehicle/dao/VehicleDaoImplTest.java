package com.cognizant.vehicle.dao;

import java.text.ParseException;

import com.cognizant.vehicle.model.Vehicle;

public class VehicleDaoImplTest {

	public static void main(String[] args) throws ParseException {
	    addVehicle();

	}
	public static void addVehicle() throws ParseException{
		VehicleDao vehicleDao= new VehicleDaoImpl();
		Vehicle v=new Vehicle();
		vehicleDao.addVehicle(v);
	}

}
