package com.learn.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.learn.vehicle.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User r) throws ParseException {
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "INSERT INTO `vrsystem`.`user` (`id`, `first_name`, `last_name`, `age`, `gender`, `contact_number`, `email`, `password`, `user_type`, `branch`) VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r.getId());
			ps.setString(2, r.getFirstName());
			ps.setString(3, r.getLastName());
			ps.setInt(4, r.getAge());
			ps.setString(5, r.getGender());
			ps.setLong(6, r.getContactNumber());
			ps.setString(7, r.getEmail());
			ps.setString(8, r.getPassword());
			ps.setString(9, r.getUserType());
			ps.setString(10, r.getBranch());

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
	public User getUser(String id, String password) {
		User reg = new User();
		Connection connection = ConnectionHandler.getConnection();
		try {
			String log = "select * from user where id = ? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(log);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				reg.setId(rs.getString(1));
				reg.setPassword(rs.getString(8));
				reg.setUserType(rs.getString(9));
				reg.setStatus(rs.getString(11));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return reg;

	}

	@Override
	public List<User> getUser() {
		List<User> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();

		try {

			String insert = "select * from  user where status='pending' and user_type='user' ";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				User rs = new User();
				rs.setId(r.getString(1));
				rs.setFirstName(r.getString(2));
				rs.setLastName(r.getString(3));
				rs.setAge(r.getInt(4));
				rs.setGender(r.getString(5));
				rs.setContactNumber(r.getLong(6));
				rs.setEmail(r.getString(7));
				rs.setPassword(r.getString(8));
				rs.setUserType(r.getString(9));
				rs.setBranch(r.getString(10));
				rs.setStatus(r.getString(11));
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
	public void  approveAdmin(User usr){
		Connection con = ConnectionHandler.getConnection();
		
		try {
			String sql = "update user set status=? where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, usr.getStatus());
			stmt.setString(2, usr.getId());
			
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

	@Override
	public void rejectAdmin(User usr) {
	Connection con = ConnectionHandler.getConnection();
		
		try {
			String sql = "update user set status=? where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, usr.getStatus());
			stmt.setString(2, usr.getId());
			
	 stmt.executeUpdate();
		}catch (Exception e) {
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