package com.learn.vehicle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class AdminSearchVehicleServlet
 */
@WebServlet({ "/AdminSearchVehicleServlet", "/AdminSearchVehicle" })
public class AdminSearchVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSearchVehicleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String type = request.getParameter("searchType");
		String val = request.getParameter("Search");
		VehicleDao vehicleDao = new VehicleDaoImpl();
		List<Vehicle> vehicleList = new ArrayList<>();

		switch (type) {
		case "byName":
			vehicleList = vehicleDao.getByVehicleName(val);

			break;

		case "byNumber":
			vehicleList = vehicleDao.getByVehicleNumber(val);

			break;

		case "byType":
			vehicleList = vehicleDao.getByVehicleType(val);

			break;

		case "byColor":
			vehicleList = vehicleDao.getByVehicleColor(val);

			break;

		case "byCapacity":
			long value = Long.parseLong(val);
			vehicleList = vehicleDao.getByVehicleCapacity(value);

			break;
		}
		request.setAttribute("vehicleList", vehicleList);
		RequestDispatcher rd = request.getRequestDispatcher("AdminSearch.jsp");

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
