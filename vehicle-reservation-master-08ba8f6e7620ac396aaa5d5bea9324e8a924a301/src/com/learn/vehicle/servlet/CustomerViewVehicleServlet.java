package com.learn.vehicle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.VehicleDao;
import com.learn.vehicle.dao.VehicleDaoImpl;
import com.learn.vehicle.model.Vehicle;

/**
 * Servlet implementation class CustomerViewVehicleServlet
 */
@WebServlet({ "/CustomerViewVehicleServlet", "/CustomerViewVehicle" })
public class CustomerViewVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerViewVehicleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			VehicleDao vehicle = new VehicleDaoImpl();
			List<Vehicle> pending = vehicle.getVehicle();
			 request.setAttribute("viewVehicles", pending);
	            RequestDispatcher rd = request.getRequestDispatcher("UserViewVehicles.jsp");
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
