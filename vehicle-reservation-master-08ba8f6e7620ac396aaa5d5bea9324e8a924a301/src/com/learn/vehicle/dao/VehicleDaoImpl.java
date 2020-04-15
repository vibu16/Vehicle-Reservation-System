package com.learn.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.learn.vehicle.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

	@Override
	public void addVehicle(Vehicle v) throws ParseException {
		Connection con = ConnectionHandler.getConnection();

		try {
			String sql = "INSERT INTO `vrsystem`.`vehicle`(`vehicle_no`, `name`, `color`, `branch`, `vehicle_type`, `seating_capacity`, `year_of_manufacture`, `insurance_edate`, `last_service`, `service_due`, `price`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, v.getVehicleNumber());
			ps.setString(2, v.getName());
			ps.setString(3, v.getColor());
			ps.setString(4, v.getBranch());
			ps.setString(5, v.getVehicleType());
			ps.setInt(6, v.getSeatingCapacity());
			ps.setDate(7, new java.sql.Date(v.getYearOfManufacture().getTime()));
			ps.setDate(8, new java.sql.Date(v.getInsuranceExpiryDate().getTime()));
			ps.setDate(9, new java.sql.Date(v.getLastServicedDate().getTime()));
			ps.setDate(10, new java.sql.Date(v.getServiceDueDate().getTime()));
			ps.setLong(11, v.getPrice());

			int rs = ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Vehicle> getVehicle() {
		List<Vehicle> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  name,vehicle_type,vehicle_no,color,seating_capacity,price from  vehicle";
			// where next_avalible_date=current_date()
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Vehicle rs = new Vehicle();
				rs.setName(r.getString(1));
				rs.setVehicleType(r.getString(2));
				rs.setVehicleNumber(r.getString(3));
				rs.setColor(r.getString(4));
				rs.setSeatingCapacity(r.getInt(5));
				rs.setPrice(r.getLong(6));
				reg.add(rs);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

	@Override
	public List<Vehicle> getAdminVehicle() {
		List<Vehicle> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  * from  vehicle";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Vehicle rs = new Vehicle();
				rs.setVehicleNumber(r.getString(1));
				rs.setName(r.getString(2));
				rs.setColor(r.getString(3));
				rs.setBranch(r.getString(4));
				rs.setVehicleType(r.getString(5));
				rs.setSeatingCapacity(r.getInt(6));
				rs.setYearOfManufacture(r.getDate(7));
				rs.setInsuranceExpiryDate(r.getDate(8));
				rs.setLastServicedDate(r.getDate(9));
				rs.setServiceDueDate(r.getDate(10));
				rs.setNextAvailableDate(r.getDate(11));
				rs.setPrice(r.getLong(12));

				reg.add(rs);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

	@Override
	public void modifyVehice(Vehicle vehicle) throws ParseException {
		List<Vehicle> vehi = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "UPDATE vehicle SET color=?,branch=?,seating_capacity=?,year_of_manufacture=?,insurance_edate=?,last_service=?,service_due=?,next_avalible_date=?,price=?,vehicle_type=?,name=? WHERE vehicle_no=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, vehicle.getColor());
			stmt.setString(2, vehicle.getBranch());
			stmt.setInt(3, vehicle.getSeatingCapacity());
			stmt.setDate(4, new java.sql.Date(vehicle.getYearOfManufacture().getTime()));
			stmt.setDate(5, new java.sql.Date(vehicle.getInsuranceExpiryDate().getTime()));
			stmt.setDate(6, new java.sql.Date(vehicle.getLastServicedDate().getTime()));
			stmt.setDate(7, new java.sql.Date(vehicle.getServiceDueDate().getTime()));
			stmt.setDate(8, new java.sql.Date(vehicle.getNextAvailableDate().getTime()));
			stmt.setLong(9, vehicle.getPrice());
			stmt.setString(10, vehicle.getVehicleType());
			stmt.setString(11, vehicle.getName());
			stmt.setString(12, vehicle.getVehicleNumber());

			int count = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

	@Override
	public Vehicle getEditVehicle(String vehicleNumber) {
		Connection con = ConnectionHandler.getConnection();
		Vehicle vehicle = new Vehicle();
		try {
			String sql = "select * from  vehicle where vehicle_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vehicleNumber);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				String color = rs.getString(3);
				String branch = rs.getString(4);
				String vehicleType = rs.getString(5);
				int seatingCapacity = rs.getInt(6);
				Date yearOfManufacture = rs.getDate(7);
				Date insuranceExpiryDate = rs.getDate(8);
				Date lastServicedDate = rs.getDate(9);
				Date serviceDueDate = rs.getDate(10);
				Date nextAvailableDate = rs.getDate(11);
				Long price = rs.getLong(12);

				vehicle = new Vehicle(vehicleNumber, name, color, branch, vehicleType, insuranceExpiryDate,
						lastServicedDate, serviceDueDate, nextAvailableDate, seatingCapacity, yearOfManufacture, price);

			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;
	}

	@Override
	public void deleteVehicle(String vehicleNumber) {
		Connection con = ConnectionHandler.getConnection();

		try {
			String sql = "DELETE FROM vehicle where vehicle_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vehicleNumber);
			ps.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Vehicle> sortVehicleList(String sort) {
		List<Vehicle> vehicle = new ArrayList<Vehicle>();
		PreparedStatement ps = null;
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "select * from  vehicle";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (sort.equalsIgnoreCase("nameA-Z")) {
				rs = ps.executeQuery(sql + " ORDER BY name");

			} else if (sort.equalsIgnoreCase("nameZ-A")) {
				rs = ps.executeQuery(sql + " ORDER BY name DESC");

			} else if (sort.equalsIgnoreCase("colorA-Z")) {
				rs = ps.executeQuery(sql + " ORDER BY color");

			} else if (sort.equalsIgnoreCase("colorZ-A")) {
				rs = ps.executeQuery(sql + " ORDER BY color DESC");
			}

			else if (sort.equalsIgnoreCase("typeA-Z")) {
				rs = ps.executeQuery(sql + " ORDER BY vehicle_type");

			} else if (sort.equalsIgnoreCase("typeZ-A")) {
				rs = ps.executeQuery(sql + " ORDER BY vehicle_type DESC");
			}

			else if (sort.equalsIgnoreCase("capacityHigh-Low")) {
				rs = ps.executeQuery(sql + " ORDER BY seating_capacity");

			} else if (sort.equalsIgnoreCase("capacityLow-High")) {
				rs = ps.executeQuery(sql + " ORDER BY seating_capacity DESC");
			}

			while (rs.next()) {
				String vehicleNumber = rs.getString("vehicle_no");
				String name = rs.getString("name");
				String color = rs.getString("color");
				String branch = rs.getString("branch");
				String vehicleType = rs.getString("vehicle_type");
				int seatingCapacity = rs.getInt("seating_capacity");
				Date yearOfManufacture = rs.getDate("year_of_manufacture");
				Date insuranceExpiryDate = rs.getDate("insurance_edate");
				Date lastServicedDate = rs.getDate("last_service");
				Date serviceDueDate = rs.getDate("service_due");
				Date nextAvailableDate = rs.getDate("next_avalible_date");
				long price = rs.getLong("price");

				Vehicle v = new Vehicle(vehicleNumber, name, color, branch, vehicleType, insuranceExpiryDate,
						lastServicedDate, serviceDueDate, nextAvailableDate, seatingCapacity, yearOfManufacture, price);
				vehicle.add(v);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return vehicle;
	}

	@Override
	public List<Vehicle> getUserSearchVehicle() {
		List<Vehicle> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  name,vehicle_type,vehicle_no,color,seating_capacity,price from  vehicle where vehicle_no=?";
			// where next_avalible_date=current_date()
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Vehicle rs = new Vehicle();
				rs.setName(r.getString(1));
				rs.setVehicleType(r.getString(2));
				rs.setVehicleNumber(r.getString(3));
				rs.setColor(r.getString(4));
				rs.setSeatingCapacity(r.getInt(5));
				rs.setPrice(r.getLong(6));
				reg.add(rs);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

	@Override
	public List<Vehicle> getByVehicleName(String name) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select  * from vehicle where name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));
				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getByVehicleNumber(String vehicleNumber) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select * from vehicle where vehicle_no=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vehicleNumber);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));
				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getByVehicleColor(String color) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select * from vehicle where color=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, color);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));

				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getByVehicleType(String type) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select * from vehicle where type=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, type);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));

				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getByVehicleCapacity(long capacity) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select * from vehicle where seating_capacity=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, capacity);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));

				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getBySortVehicleName(String name) {
		List<Vehicle> vehicle = new ArrayList<>();
		Connection con = ConnectionHandler.getConnection();

		String sql = "select * from vehicle where name=? order by name asc";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle vehi = new Vehicle();
				vehi.setVehicleNumber(rs.getString("vehicle_no"));
				vehi.setName(rs.getString("name"));
				vehi.setColor(rs.getString("color"));
				vehi.setBranch(rs.getString("branch"));
				vehi.setVehicleType(rs.getString("vehicle_type"));
				vehi.setSeatingCapacity(rs.getInt("seating_capacity"));
				vehi.setYearOfManufacture(rs.getDate("year_of_manufacture"));
				vehi.setInsuranceExpiryDate(rs.getDate("insurance_edate"));
				vehi.setLastServicedDate(rs.getDate("last_service"));
				vehi.setServiceDueDate(rs.getDate("service_due"));
				vehi.setNextAvailableDate(rs.getDate("next_avalible_date"));

				vehi.setPrice(rs.getLong("price"));
				vehicle.add(vehi);
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicle;

	}

	@Override
	public List<Vehicle> getInsuranceExpiryDateVehicle() {
		List<Vehicle> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  * from  vehicle";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Vehicle rs = new Vehicle();
				rs.setVehicleNumber(r.getString(1));
				rs.setName(r.getString(2));
				rs.setColor(r.getString(3));
				rs.setBranch(r.getString(4));
				rs.setVehicleType(r.getString(5));
				rs.setSeatingCapacity(r.getInt(6));
				rs.setYearOfManufacture(r.getDate(7));
				rs.setInsuranceExpiryDate(r.getDate(8));
				rs.setLastServicedDate(r.getDate(9));
				rs.setServiceDueDate(r.getDate(10));
				rs.setNextAvailableDate(r.getDate(11));
				rs.setPrice(r.getLong(12));

				reg.add(rs);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

	@Override
	public List<Vehicle> getServiceDueDateVehicle() {
		List<Vehicle> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  * from  vehicle";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Vehicle rs = new Vehicle();
				rs.setVehicleNumber(r.getString(1));
				rs.setName(r.getString(2));
				rs.setColor(r.getString(3));
				rs.setBranch(r.getString(4));
				rs.setVehicleType(r.getString(5));
				rs.setSeatingCapacity(r.getInt(6));
				rs.setYearOfManufacture(r.getDate(7));
				rs.setInsuranceExpiryDate(r.getDate(8));
				rs.setLastServicedDate(r.getDate(9));
				rs.setServiceDueDate(r.getDate(10));
				rs.setNextAvailableDate(r.getDate(11));
				rs.setPrice(r.getLong(12));

				reg.add(rs);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

	@Override
	public void nextAvalibleDate(Vehicle vehicle) {
		Connection con = ConnectionHandler.getConnection();

		try {
			String sql = "update vehicle set next_avalible_date=? where vehicle_no=?";
			PreparedStatement stmt = con.prepareStatement(sql);			
			stmt.setDate(1, new java.sql.Date(vehicle.getNextAvailableDate().getTime()));
			stmt.setString(2, vehicle.getVehicleNumber());

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
