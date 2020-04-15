package com.cognizant.vehicle.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.vehicle.dao.RegisterDao;
import com.cognizant.vehicle.dao.RegisterDaoImpl;
import com.cognizant.vehicle.dao.VehicleDao;
import com.cognizant.vehicle.dao.VehicleDaoImpl;
import com.cognizant.vehicle.model.Vehicle;
import com.cognizant.vehicle.util.DateUtil;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet({ "/LogoutServlet", "/Logout" })
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
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
		/*try {
			String id=request.getParameter("");                
			String firstName=request.getParameter("");        
			String lastName=request.getParameter("");        
			int age=Integer.parseInt("");                  
			String gender=request.getParameter("");             
			int contactNumber=Integer.parseInt("");       
			String email=request.getParameter("");             
			String userType=request.getParameter("");           
			String password=request.getParameter("");           
			String securityQuestion=request.getParameter("");   
			String branch=request.getParameter("");            
			String status=request.getParameter("");           
			
		
			
		
		
			String vehicleNumber= request.getParameter("vehinum");
			String name= request.getParameter("vehiname");
			String color= request.getParameter("vehicolor");
			String branch=request.getParameter("vehibranch");
			String vehicleType= request.getParameter("vehimod");
			Date insuranceExpiryDate= DateUtil.convertToDate(request.getParameter("vehirenewal"));
			Date lastServicedDate= DateUtil.convertToDate(request.getParameter("lastdate"));
			Date serviceDueDate= DateUtil.convertToDate(request.getParameter("nextservice"));
			String status= request.getParameter("cars");
			
			
				Vehicle v=new Vehicle(vehicleNumber,name,color,branch,vehicleType,insuranceExpiryDate ,lastServicedDate,serviceDueDate,status);
				VehicleDao vehicleDao=new VehicleDaoImpl();
				vehicleDao.addVehicle(v);
				
				
				request.setAttribute("add", "Vehicle added Successfully");
				RequestDispatcher rd = request.getRequestDispatcher("AddVehicle.jsp");
				rd.forward(request, response);
			} catch (Exception ex) {
				ex.printStackTrace();
			}*/
		
	
	}}


