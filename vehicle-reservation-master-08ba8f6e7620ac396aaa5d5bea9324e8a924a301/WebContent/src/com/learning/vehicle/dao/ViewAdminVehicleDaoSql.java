package com.cognizant.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.vehicle.model.Vehicle;

public class ViewAdminVehicleDaoSql implements VehicleDao {

	
	@Override
	public void modifyVehice(Vehicle vehicle) {
		List<Vehicle> vehi = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "update vehicle set name=?,color=?,branch=?,vehicle_type=?,insurance_edate=?,last_service=?,service_due=?,status=? where vehicle_no=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,vehicle.getVehicleName());
			stmt.setString(2,vehicle.getVehicleModel());
			stmt.setString(3,vehicle.getColor());
			stmt.setString(4,vehicle.getBranch());
			stmt.setDate(5,new java.sql.Date(vehicle.getYearOfManufacture().getTime()));
			stmt.setDate(6,new java.sql.Date(vehicle.getInsuranceExpiryDate().getTime()));
			stmt.setDate(7,new java.sql.Date(vehicle.getLastServicedDate().getTime()));
			stmt.setDate(8,new java.sql.Date(vehicle.getServiceDueDate().getTime()));
			stmt.setString(9,vehicle.getStatus());
			 int count=stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}}
		
	}

	@Override
	public Vehicle getVehicle(String vehicleNo) {
		Vehicle vehi = new Vehicle();
		Connection con = ConnectionHandler.getConnection();
		try {
		String sql="select* from vehicle";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		if(rs.next()) {
			vehi.setVehicleNumber(rs.getString(1));
			vehi.setVehicleName(rs.getString(2));
			vehi.setVehicleModel(rs.getString(3));
			vehi.setColor(rs.getString(4));
			vehi.setBranch(rs.getString(5));
			vehi.setYearOfManufacture(rs.getDate(6));
			vehi.setInsuranceExpiryDate(rs.getDate(7));
			vehi.setLastServicedDate(rs.getDate(8));
			vehi.setServiceDueDate(rs.getDate(9));
			vehi.setStatus(rs.getString(10));
		
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vehi;
	}

	@Override
	public void removeVehicle(String vehicleNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehicle> getViewVehicleAdmin() throws Exception {
		List<Vehicle> vehicle = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "select * from vehicle";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Vehicle vehi = new Vehicle();

				vehi.setVehicleNumber(rs.getString(1));
				vehi.setVehicleName(rs.getString(2));
				vehi.setVehicleModel(rs.getString(3));
				vehi.setColor(rs.getString(4));
				vehi.setBranch(rs.getString(5));
				vehi.setYearOfManufacture(rs.getDate(6));
				vehi.setInsuranceExpiryDate(rs.getDate(7));
				vehi.setLastServicedDate(rs.getDate(8));
				vehi.setServiceDueDate(rs.getDate(9));
				vehi.setStatus(rs.getString(10));
				vehicle.add(vehi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return vehicle;

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
