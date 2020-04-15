package com.cognizant.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.vehicle.model.Vehicle;
import com.cognizant.vehicle.util.DateUtil;


public class ViewAdminVehicleDaoSqlTest {

	public static void main(String[] args) throws Exception {
		testGetViewVehicle();
		testModifyVehicle();
		System.out.println("________after modified_________");
		testGetViewVehicle();
	}

	private static void testGetViewVehicle() throws Exception {
		VehicleDao dao=new ViewAdminVehicleDaoSql();
		List<Vehicle> vehi=dao.getViewVehicleAdmin();
		for(Vehicle x : vehi) {
			System.out.println(x);
		}	
	}
	private static void  testModifyVehicle() throws ParseException {
		Vehicle vehicle=new Vehicle("Lk878","NANO","ry","POK","tyt",DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),"avail");
		VehicleDao dao=new ViewAdminVehicleDaoSql();
		dao.modifyVehice(vehicle);
	}

	

}
