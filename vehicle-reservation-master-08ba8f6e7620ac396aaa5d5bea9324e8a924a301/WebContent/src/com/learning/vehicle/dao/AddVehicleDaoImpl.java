package com.cognizant.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.vehicle.model.Vehicle;

public class AddVehicleDaoImpl implements AddVehicleDao {

	@Override
	public void addVehicle(Vehicle vehicle) throws SQLException {
	    PreparedStatement preparedStatement=null;
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "select * from vehicle";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vehicle v = new Vehicle();
				v.setVehicleNumber(rs.getString("vehicleNumber"));
				v.setBranch(rs.getString("branch"));
				v.setVehicleType(rs.getString("vehicleType"));
				v.setInsuranceExpiryDate(rs.getDate("insuranceExpiryDate"));
				v.setLastServicedDate(rs.getDate("lastServicedDate"));
				v.setServiceDueDate(rs.getDate("serviceDueDate"));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			con.close();
		}

	}

}
