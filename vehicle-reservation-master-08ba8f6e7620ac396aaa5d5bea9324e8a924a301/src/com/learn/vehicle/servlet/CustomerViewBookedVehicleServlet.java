package com.learn.vehicle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.BookingDao;
import com.learn.vehicle.dao.BookingDaoImpl;
import com.learn.vehicle.model.BookingVehicle;

/**
 * Servlet implementation class CustomerViewBookedVehicleServlet
 */
@WebServlet("/CustomerViewBookedVehicleServlet")
public class CustomerViewBookedVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerViewBookedVehicleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String userId=request.getParameter("id");
			BookingDao bookingDao = new BookingDaoImpl();
			List<BookingVehicle> booking =bookingDao.getCustomerBookingDetail(userId);
			request.setAttribute("viewVehicles", booking);
			RequestDispatcher rd = request.getRequestDispatcher("CustomerViewBooking.jsp");
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
