package com.learn.vehicle.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.VehicleDao;
import com.learn.vehicle.dao.VehicleDaoImpl;
import com.learn.vehicle.model.Vehicle;
import com.learn.vehicle.util.DateUtil;


/**
 * Servlet implementation class AddVehicleServlet
 */
@WebServlet({ "/AddVehicleServlet", "/AddVehicle" })
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddVehicleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String vehicleNumber = request.getParameter("vehinum");
			String name = request.getParameter("vehiname");
			String color = request.getParameter("vehicolor");
			int seatingCapacity = (Integer.parseInt(request.getParameter("vehiseat")));
			String branch = request.getParameter("vehibranch");
			String vehicleType = request.getParameter("vehimod");
			Date yearOfManufacture = DateUtil.convertToDate(request.getParameter("year"));
			Date insuranceExpiryDate = DateUtil.convertToDate(request.getParameter("vehirenewal"));
			Date lastServicedDate = DateUtil.convertToDate(request.getParameter("lastdate"));
			Date serviceDueDate = DateUtil.convertToDate(request.getParameter("nextservice"));
			long price = Long.parseLong(request.getParameter("vehiprice"));       

			
			Vehicle v = new Vehicle(vehicleNumber, name, color, branch, vehicleType, insuranceExpiryDate, lastServicedDate, serviceDueDate, seatingCapacity, yearOfManufacture, price);
			VehicleDao vehicleDao = new VehicleDaoImpl();
			vehicleDao.addVehicle(v);

			request.setAttribute("add", "Vehicle added Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("AddVehicle.jsp");
			rd.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}