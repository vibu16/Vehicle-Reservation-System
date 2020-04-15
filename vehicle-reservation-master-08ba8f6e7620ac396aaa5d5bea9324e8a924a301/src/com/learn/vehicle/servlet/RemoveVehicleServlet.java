package com.learn.vehicle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.VehicleDao;
import com.learn.vehicle.dao.VehicleDaoImpl;

/**
 * Servlet implementation class RemoveVehicleServlet
 */
@WebServlet({ "/RemoveVehicleServlet", "/RemoveVehicle" })
public class RemoveVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveVehicleServlet() {
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
			VehicleDao vehicleDao = new VehicleDaoImpl();
			String vehicleNumber = request.getParameter("vehinum");
			vehicleDao.deleteVehicle(vehicleNumber);
			request.setAttribute("msg", "Vehicle removed successfully");
			RequestDispatcher rd = request.getRequestDispatcher("AdminViewVehicle");
			rd.forward(request, response);

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
