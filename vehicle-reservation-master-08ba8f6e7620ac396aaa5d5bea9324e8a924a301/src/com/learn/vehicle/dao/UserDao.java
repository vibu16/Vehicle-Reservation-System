package com.learn.vehicle.dao;

import java.text.ParseException;
import java.util.List;

import com.learn.vehicle.model.User;



public interface UserDao {
	public  void addUser(User r) throws ParseException;
	public User getUser(String id,String password);
	public List<User> getUser();
	public void approveAdmin(User usr);
	public void rejectAdmin(User usr);

}
