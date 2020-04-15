
package com.cognizant.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.vehicle.model.Register;

public class RegisterDaoImpl implements RegisterDao {

	@Override

	public List<Register> getAdmin() {
		List<Register> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();

		try {

			String insert = "select * from  register where status='pending' and user_type='admin' ";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Register rs = new Register();
				rs.setId(r.getString(1));
				rs.setFirstName(r.getString(2));
				rs.setLastName(r.getString(3));
				rs.setAge(r.getInt(4));
				rs.setGender(r.getString(5));
				rs.setContactNumber(r.getLong(6));
				rs.setEmail(r.getString(7));
				rs.setPassword(r.getString(8));
				rs.setSecurityQuestion(r.getString(9));
				rs.setAnswer(r.getString(10));
				rs.setUserType(r.getString(11));
				rs.setBranch(r.getString(12));
				rs.setStatus(r.getString(13));
				reg.add(rs);

			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				con.close();

=======
	public void addAdmin(Register r) throws ParseException {
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "INSERT INTO `vrsystem`.`register` (`id`, `first_name`, `last_name`, `age`, `gender`, `contact_number`, `email`, `password`, `security_question`, `answer`,`user_type`, `branch`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r.getId());
			ps.setString(2, r.getFirstName());
			ps.setString(3, r.getLastName());
			ps.setInt(4, r.getAge());
			ps.setString(5, r.getGender());
			ps.setLong(6, r.getContactNumber());
			ps.setString(7, r.getEmail());
			ps.setString(8, r.getPassword());
			ps.setString(9, r.getSecurityQuestion());
			ps.setString(10, r.getAnswer());
			ps.setString(11, r.getUserType());
			ps.setString(12, r.getBranch());

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
	public Register getLogin(String id, String password) {
		Register reg = new Register();
		Connection connection = ConnectionHandler.getConnection();
		try {
			String log = "select * from register where id = ? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(log);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				reg.setId(rs.getString(1));
				reg.setPassword(rs.getString(8));
				reg.setUserType(rs.getString(11));
				reg.setStatus(rs.getString(13));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}

<<<<<<< HEAD
}
=======
	@Override
	public List<Register> getAdmin() {
		List<Register> reg = new ArrayList<>();

		Connection con = ConnectionHandler.getConnection();

		try {

			String insert = "select * from  register where status='pending' and user_type='user' ";
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Register rs = new Register();
				rs.setId(r.getString(1));
				rs.setFirstName(r.getString(2));
				rs.setLastName(r.getString(3));
				rs.setAge(r.getInt(4));
				rs.setGender(r.getString(5));
				rs.setContactNumber(r.getLong(6));
				rs.setEmail(r.getString(7));
				rs.setPassword(r.getString(8));
				rs.setSecurityQuestion(r.getString(9));
				rs.setAnswer(r.getString(10));
				rs.setUserType(r.getString(11));
				rs.setBranch(r.getString(12));
				rs.setStatus(r.getString(13));
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
	public void approveMember(Register register) {
		Connection con = ConnectionHandler.getConnection();
		try {
			String sql = "UPDATE register SET  status=? WHERE id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, register.getId());
			ps.setString(2, register.getFirstName());
			ps.setString(3, register.getLastName());
			ps.setInt(4, register.getAge());
			ps.setString(5, register.getGender());
			ps.setLong(6, register.getContactNumber());
			ps.setString(7, register.getEmail());
			ps.setString(8, register.getPassword());
			ps.setString(9, register.getSecurityQuestion());
			ps.setString(10, register.getAnswer());
			ps.setString(11, register.getUserType());
			ps.setString(12, register.getBranch());
			ps.setString(13,register.getStatus());

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
	public void rejectMember(Register register) {
		// TODO Auto-generated method stub
		
	}
}
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
