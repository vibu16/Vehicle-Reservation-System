package com.learn.vehicle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.BookingDao;
import com.learn.vehicle.dao.BookingDaoImpl;
import com.learn.vehicle.model.Vehicle;



/**
 * Servlet implementation class ShowBookServlet
 */
@WebServlet("/ShowBookServlet")
public class ShowBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			BookingDao bookingDao = new BookingDaoImpl();
			String vehicleNumber =request.getParameter("vehinum");
			Vehicle vehicle = bookingDao.getEditVehicle(vehicleNumber);			
			request.setAttribute("vehicle", vehicle);
			RequestDispatcher rd = request.getRequestDispatcher("BookingConfirmation.jsp");
			rd.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
