package com.learn.vehicle.dao;

public class VehicleEmptyException extends Exception{
	public VehicleEmptyException() {
		super("Cart Empty");

	}

	public VehicleEmptyException(String message) {
		super(message);

	}
}
