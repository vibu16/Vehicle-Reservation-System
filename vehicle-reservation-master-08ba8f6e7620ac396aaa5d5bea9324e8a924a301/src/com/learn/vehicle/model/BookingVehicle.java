package com.learn.vehicle.model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingVehicle {
	private String userId;
	private String vehicleNumber;
	private String vehicleName;
	private long price;
	private Date startDate;
	private Date endDate;
	private int noOfDays;
	private String promocodes;
	private long refund;
	private String status;

	public BookingVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingVehicle(String userId, String vehicleNumber, String vehicleName, long price, Date startDate,
			Date endDate, int noOfDays, String promocodes, long refund, String status) {
		super();
		this.userId = userId;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfDays = noOfDays;
		this.promocodes = promocodes;
		this.refund = refund;
		this.status = status;
	}

	public BookingVehicle(String vehicleNumber, String status) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.status = status;
	}

	public BookingVehicle(String userId, String vehicleNumber, String vehicleName, long price, Date startDate,
			Date endDate, int noOfDays, String promocodes, String status) {
		super();
		this.userId = userId;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfDays = noOfDays;
		this.promocodes = promocodes;
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getPromocodes() {
		return promocodes;
	}

	public void setPromocodes(String promocodes) {
		this.promocodes = promocodes;
	}

	public long getRefund() {
		return refund;
	}

	public void setRefund(long refund) {
		this.refund = refund;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat box = NumberFormat.getInstance();
		box.setGroupingUsed(true);
		return String.format(userId, vehicleNumber, vehicleName, box.format(price), sd.format(startDate),
				sd.format(endDate), box.format(noOfDays), promocodes, box.format(refund), status);
	}

}
