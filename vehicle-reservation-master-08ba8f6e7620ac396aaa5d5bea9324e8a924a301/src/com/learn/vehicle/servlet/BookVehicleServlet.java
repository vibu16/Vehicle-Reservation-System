package com.learn.vehicle.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.BookingDao;
import com.learn.vehicle.dao.BookingDaoImpl;
import com.learn.vehicle.model.BookingVehicle;
import com.learn.vehicle.util.DateUtil;

/**
 * Servlet implementation class BookVehicleServlet
 */
@WebServlet({ "/BookVehicleServlet", "/BookVehicle" })
public class BookVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookVehicleServlet() {
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
			String userId = request.getParameter("id");
			String vehicleName = request.getParameter("vehiname");
			String vehicleNumber = request.getParameter("vehinum");
			long price = Long.parseLong(request.getParameter("amount"));
			Date startDate = DateUtil.convertToDate(request.getParameter("from"));
			Date endDate = DateUtil.convertToDate(request.getParameter("to"));
			int noOfDays = (Integer.parseInt(request.getParameter("numdays")));
			String promocodes = request.getParameter("code");
			String status = request.getParameter("bookType");
			
			BookingVehicle b=new BookingVehicle(userId, vehicleNumber, vehicleName, price, startDate, endDate, noOfDays, promocodes, status);
			BookingDao bookingDao = new BookingDaoImpl();
			bookingDao.addBooking(b);
			
			request.setAttribute("add", "Vehicle Booked Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("NextAvalibleDateServlet");
			rd.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
