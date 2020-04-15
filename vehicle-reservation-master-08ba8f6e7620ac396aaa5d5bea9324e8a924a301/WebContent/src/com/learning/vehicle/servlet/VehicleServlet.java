package com.cognizant.vehicle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cognizant.vehicle.dao.ViewVehicleDao;
import com.cognizant.vehicle.model.Vehicle;
import com.cognizant.vehicle.util.DateUtil;

/**
 * Servlet implementation class VehicleServlet
 */
@WebServlet("/VehicleServlet")
public class VehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private ViewVehicleDao viewVehicleDao;
    public void init() {
	viewVehicleDao =new ViewVehicleDao();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		switch(action) {
	
		case "/update":
			try {
				updateVehicle(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/delete":
			try {
				deleteVehicle(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/edit":
			showEditForm(request,response);
			break;
		
			default:
				viewVehicles(request,response);
				break;
		}
	}
	//return List of vehicle
	private void viewVehicles(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<Vehicle> vehicle=new ArrayList<>();
		vehicle=viewVehicleDao.selectAllVehicles();
		request.setAttribute("viewVehicles", vehicle);
		RequestDispatcher rd=request.getRequestDispatcher("ViewVehicles.jsp ");
		rd.forward(request, response);
		}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String vehicleNumber=request.getParameter("vehinum");
			Vehicle existingVehicle=viewVehicleDao.selectVehicle(vehicleNumber);
			RequestDispatcher rd=request.getRequestDispatcher("EditVehicles.jsp ");
			request.setAttribute("vehicle", existingVehicle);
			rd.forward(request, response);
		}
		private void updateVehicle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException, SQLException {
			
			String name=request.getParameter("vehiname");
			String model=request.getParameter("vehimod");
			String number=request.getParameter("vehinum");
			String color=request.getParameter("vehicolor");
			String branch=request.getParameter("vehibranch");
			String year=request.getParameter("year");
			String renewal=request.getParameter("vehirenewal");
			String lastservice=request.getParameter("lastdate");
			String nextservice=request.getParameter("nextservice");
			String status=request.getParameter("cars");
			Vehicle vehicle=new Vehicle(name,model,number,color,branch,DateUtil.convertToDate(year),DateUtil.convertToDate(renewal),DateUtil.convertToDate(lastservice),DateUtil.convertToDate(nextservice),status);
			viewVehicleDao.updateVehicle(vehicle);
			request.setAttribute("mes", "Vehicle details updated successfully");
			RequestDispatcher rd=request.getRequestDispatcher("EditVehicleStatus");
			rd.forward(request, response);
		
		}
		private void deleteVehicle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException, SQLException {
			String vehicleNumber=request.getParameter("vehinum");
			viewVehicleDao.deleteVehicle(vehicleNumber);
			request.setAttribute("mes", "Vehicle details Deleted successfully");
			RequestDispatcher rd=request.getRequestDispatcher("EditVehicleStatus");
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
