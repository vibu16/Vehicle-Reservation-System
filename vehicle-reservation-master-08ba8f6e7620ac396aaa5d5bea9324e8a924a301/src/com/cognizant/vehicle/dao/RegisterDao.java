package com.cognizant.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.vehicle.model.Register;


public interface RegisterDao {

	public  void addAdmin(Register r) throws ParseException;
	public Register getLogin(String id,String password);
	public List<Register> getAdmin();
	public void approveMember(Register register);
	public void rejectMember(Register register);
 

}
