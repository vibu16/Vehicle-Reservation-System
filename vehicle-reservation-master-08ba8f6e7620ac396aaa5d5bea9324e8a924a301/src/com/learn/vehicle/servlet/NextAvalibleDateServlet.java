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
 * Servlet implementation class NextAvalibleDateServlet
 */
@WebServlet("/NextAvalibleDateServlet")
public class NextAvalibleDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NextAvalibleDateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String vehicleNumber = request.getParameter("vehinum");
			Date nextAvailableDate = DateUtil.convertToDate(request.getParameter("to"));
			
			Vehicle vehicle=new Vehicle(vehicleNumber, nextAvailableDate);
			VehicleDao vehicleDao = new VehicleDaoImpl();
			vehicleDao.nextAvalibleDate(vehicle);			
			RequestDispatcher rd = request.getRequestDispatcher("CustomerViewBookedVehicleServlet");
			rd.forward(request, response);
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}
	}

}
