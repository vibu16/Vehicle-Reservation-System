package com.cognizant.vehicle.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.vehicle.dao.VehicleDao;
import com.cognizant.vehicle.dao.ViewVehicleDao;
import com.cognizant.vehicle.model.Vehicle;

/**
 * Servlet implementation class AdminViewVehicleServlet
 */
@WebServlet({ "/AdminViewVehicleServlet", "/AdminViewVehicle" })
public class AdminViewVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewVehicleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			List<Vehicle> vehicle=new ArrayList<>();
			VehicleDao vehicleDao = null;
			try {
				vehicleDao = new ViewVehicleDao();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				vehicle=vehicleDao.getViewVehicleAdmin();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("viewVehicles", vehicle);
			RequestDispatcher rd=request.getRequestDispatcher("ViewVehicles.jsp ");
			rd.forward(request, response);
			}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
