package com.cognizant.vehicle.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cognizant.vehicle.model.Vehicle;

public class SearchDao {

	//private Connection connection;
	//public static final Logger LOG = Logger.getLogger("UserDao");
	
	public ArrayList<String> search(String value)
	{
		
		ArrayList<String> al=new ArrayList<String>();
		//LOG.info("Inside - method search in SearchDao class");
		ResultSet result = null;
		java.sql.Statement statement = null;
		try {
			Connection con=ConnectionHandler.getConnection();
			//statement = connection.createStatement(); 
			result = statement.executeQuery("select * from vrsystem;"); 
			while (result.next()) {
				 al.add(result.getString(value));
			}
			//LOG.info("Exit - method search in SearchDao class");
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return al;

}
	
	public ArrayList<Vehicle> searchItem(String first,String second)
	{
		System.out.println("in search dao");
		ArrayList<Vehicle> list=new ArrayList<Vehicle>();
		//LOG.info("Inside - method search in SearchDao class");
		ResultSet result = null;
		java.sql.Statement statement = null;
		try {
			Connection con=ConnectionHandler.getConnection();
			System.out.println("in try");
			//statement = Connection.createStatement(); 
     		//statement.setString(1, first);
			if(Character.isDigit(second.charAt(0)))
				result = statement.executeQuery("select * from vrsystem where color=?");
//				statement.setInt(2, Integer.parseInt(second));
			else
				result = statement.executeQuery("select * from vrsystem where vehicle_no=?");
//				statement.setString(2,second);
			while (result.next()) {
				Vehicle vehicle=new Vehicle();
				vehicle.setVehicleNumber(result.getString(1));
				vehicle.setBranch(String.valueOf(result.getInt(2)));
				vehicle.setVehicleType(result.getString(3));
				vehicle.setInsuranceExpiryDate(result.getDate(4));
				vehicle.setLastServicedDate(result.getDate(5));
				vehicle.setServiceDueDate(result.getDate(6));
				list.add(vehicle);
				System.out.println(list);
				
			}
			//0LOG.info("Exit - method search in SearchDao class");
			return list;
			
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("after in search dao");
		return list;

}	
}
