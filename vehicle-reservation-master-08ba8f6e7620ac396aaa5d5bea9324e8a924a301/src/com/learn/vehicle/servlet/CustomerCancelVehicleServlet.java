package com.learn.vehicle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.BookingDao;
import com.learn.vehicle.dao.BookingDaoImpl;
import com.learn.vehicle.model.BookingVehicle;

/**
 * Servlet implementation class CustomerCancelVehicleServlet
 */
@WebServlet("/CustomerCancelVehicleServlet")
public class CustomerCancelVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerCancelVehicleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String vehicleNumber = request.getParameter("vehinum");
			String status = "cancelled";
			BookingVehicle b = new BookingVehicle(vehicleNumber, status);
			BookingDao booking = new BookingDaoImpl();
			booking.cancelVehicle(b);
			request.setAttribute("app", "Vehicle Cancelled");
			request.getRequestDispatcher("CustomerViewBookedVehicleServlet").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
