package com.cognizant.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.vehicle.model.Vehicle;

import com.cognizant.vehicle.util.DateUtil;

public class ViewVehicleDao implements VehicleDao {
	private static List<Vehicle> vehicleList; 
	
	public ViewVehicleDao() throws ParseException {
		if(vehicleList == null) {
			vehicleList=new ArrayList<>();
			vehicleList.add(new Vehicle("Nf6787","fgf","ry","fh","tyt",DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),"avail"));
			vehicleList.add(new Vehicle("Lk878","Audi","ry","fh","tyt",DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),"avail"));
			vehicleList.add(new Vehicle("PO987","Hondai","ry","fh","tyt",DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),"avail"));
		}
	}
	
	

	

	@Override
	public void modifyVehice(Vehicle vehicle) {
		// TODO Auto-generated method stub
		Vehicle vehi=getVehicle(vehicle.getVehicleNumber());
		vehi.setVehicleName(vehicle.getVehicleName());
		vehi.setVehicleModel(vehicle.getVehicleModel());
		vehi.setColor(vehicle.getColor());
		vehi.setBranch(vehicle.getBranch());
		vehi.setYearOfManufacture(vehicle.getYearOfManufacture());
		vehi.setInsuranceExpiryDate(vehicle.getInsuranceExpiryDate());
		vehi.setLastServicedDate(vehicle.getLastServicedDate());
		vehi.setServiceDueDate(vehicle.getServiceDueDate());
		vehi.setStatus(vehicle.getStatus());
		
		
	}
	public Vehicle getVehicle(String vehicleId) {
		Vehicle vehicle= null;
		for (Vehicle x : vehicleList)
		{
			
			if(x.getVehicleNumber()==vehicleId)
			{
				vehicle=x;
				break;
			}
		}
		return vehicle;
	}
		@Override
	public void removeVehicle(String vehicleNo) throws Exception {

			List<Vehicle> vehi = new ArrayList<>();
		for(Vehicle v : vehicleList) {
			if(v.getVehicleNumber()==vehicleNo) {
				vehi.remove(v);
			}
		}
	
	}

		@Override
		public List<Vehicle> getViewVehicleAdmin() throws Exception {
			return vehicleList;
		}

		@Override
		public List<Vehicle> getAdminViewVehicles() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Vehicle> getUserViewVehicles() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void addVehicle(Vehicle v) throws ParseException {
			// TODO Auto-generated method stub
			
		}
}
