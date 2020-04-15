package com.cognizant.vehicle.dao;

import java.util.List;

import com.cognizant.vehicle.model.Vehicle;
import com.cognizant.vehicle.util.DateUtil;



public class ViewVehicleDaoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		testGetViewVehicle();
		testModifyVehicle();
		testGetViewVehicle();
		testRemoveVehicle();
		System.out.println("*******************");
		testGetViewVehicle();
	}
private static void testGetViewVehicle() throws Exception{
	VehicleDao dao=new ViewVehicleDao();
	List<Vehicle> vehi=dao.getViewVehicleAdmin();
	for(Vehicle x : vehi) {
		System.out.println(x);
	}	
	}
public static void testModifyVehicle() throws Exception  {
	Vehicle vehicle=new Vehicle("PO987","NANO","ry","POK","tyt",DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),DateUtil.convertToDate("15/03/2017"),"avail");
	VehicleDao dao=new ViewVehicleDao();
	dao.modifyVehice(vehicle);
}
public static void testRemoveVehicle() throws Exception {
	VehicleDao dao=new ViewVehicleDao();
	
	System.out.println("delete");
	
		dao.removeVehicle("PO987");
	
	
}
	}


