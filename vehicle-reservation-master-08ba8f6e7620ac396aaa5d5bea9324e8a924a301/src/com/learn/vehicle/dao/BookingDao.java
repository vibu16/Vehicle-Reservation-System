package com.learn.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.learn.vehicle.model.BookingVehicle;
import com.learn.vehicle.model.Vehicle;





public interface BookingDao {
	public  void addBooking(BookingVehicle b) throws ParseException;
	public Vehicle getEditVehicle(String vehicleNumber);
	public List<BookingVehicle> getBookingDetail();
	public List<BookingVehicle> getCancelDetail();
	public List<BookingVehicle> getCustomerBookingDetail(String userId);
	public void cancelVehicle(BookingVehicle book);
}
