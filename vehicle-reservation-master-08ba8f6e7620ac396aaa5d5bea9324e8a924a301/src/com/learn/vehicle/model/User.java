package com.learn.vehicle.model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class User {
private String id;
private String firstName;
private String lastName;
private int age;
private String gender;
private long contactNumber;
private String email;
private String userType;
private String password;
private String branch;
private String status;




public User() {
	super();
	// TODO Auto-generated constructor stub
}




public User(String id ,String status) {
	super();
	this.id=id;
	this.status = status;
}




public User(String id, String firstName, String lastName, int age, String gender, long contactNumber, String email,
		String userType, String password, String branch) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	this.contactNumber = contactNumber;
	this.email = email;
	this.userType = userType;
	this.password = password;
	this.branch = branch;
}




public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}




public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
}




public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}




public String getGender() {
	return gender;
}




public void setGender(String gender) {
	this.gender = gender;
}




public long getContactNumber() {
	return contactNumber;
}




public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getUserType() {
	return userType;
}




public void setUserType(String userType) {
	this.userType = userType;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




public String getBranch() {
	return branch;
}




public void setBranch(String branch) {
	this.branch = branch;
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
	return String.format(id,firstName,lastName,box.format(age),gender,box.format(contactNumber),email,userType
			,password,branch,status);
}



}
