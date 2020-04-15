package com.learn.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.learn.vehicle.model.BookingVehicle;
import com.learn.vehicle.model.Vehicle;

public class BookingDaoImpl implements BookingDao {

	@Override
	public void addBooking(BookingVehicle b) throws ParseException {
		Connection con = ConnectionHandler.getConnection();

		try {
			String sql = "INSERT INTO `vrsystem`.`booking`(`booking_us_id`,`booking_vc_name`, `booking_vc_no`, `price`, `start_date`, `end_date`,`no_of_days`, `promo_codes`,`status`) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, b.getUserId());
			ps.setString(2, b.getVehicleName());
			ps.setString(3, b.getVehicleNumber());
			ps.setLong(4, b.getPrice());
			ps.setDate(5, new java.sql.Date(b.getStartDate().getTime()));
			ps.setDate(6, new java.sql.Date(b.getEndDate().getTime()));
			ps.setInt(7, b.getNoOfDays());
			ps.setString(8, b.getPromocodes());
			ps.setString(9, b.getStatus());

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
	public List<BookingVehicle> getBookingDetail() {
		List<BookingVehicle> book = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  booking_us_id,booking_vc_no,price,start_date,end_date,no_of_days,promo_codes,status from  booking where status IN ('cash','card')";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				BookingVehicle rs = new BookingVehicle();
				rs.setUserId(r.getString(1));
				rs.setVehicleNumber(r.getString(2));
				rs.setPrice(r.getLong(3));
				rs.setStartDate(r.getDate(4));
				rs.setEndDate(r.getDate(5));
				rs.setNoOfDays(r.getInt(6));
				rs.setPromocodes(r.getString(7));
				rs.setStatus(r.getString(8));

				book.add(rs);

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
		return book;
	}

	@Override
	public List<BookingVehicle> getCancelDetail() {
		List<BookingVehicle> book = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  booking_us_id,booking_vc_no,price,refund from  booking where status='cancelled'";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				BookingVehicle rs = new BookingVehicle();
				rs.setUserId(r.getString(1));
				rs.setVehicleNumber(r.getString(2));
				rs.setPrice(r.getLong(3));
				rs.setRefund(r.getLong(4));

				book.add(rs);

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
		return book;
	}

	@Override
	public List<BookingVehicle> getCustomerBookingDetail(String userId) {
		List<BookingVehicle> book = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();
		try {

			String insert = "select  booking_us_id,booking_vc_no,price,start_date,end_date,no_of_days,promo_codes,status from  booking where booking_us_id=? and status IN ('cash','card')";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			preparedStatement.setString(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				BookingVehicle b = new BookingVehicle();
				b.setUserId(rs.getString(1));
				b.setVehicleNumber(rs.getString(2));
				b.setPrice(rs.getLong(3));
				b.setStartDate(rs.getDate(4));
				b.setEndDate(rs.getDate(5));
				b.setNoOfDays(rs.getInt(6));
				b.setPromocodes(rs.getString(7));
				b.setStatus(rs.getString(8));

				book.add(b);

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
		return book;
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
	public void cancelVehicle(BookingVehicle book) {
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql =  "UPDATE booking SET status=? WHERE booking_vc_no=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, book.getStatus());
			stmt.setString(2, book.getVehicleNumber());
			stmt.executeUpdate();
	}catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
}
