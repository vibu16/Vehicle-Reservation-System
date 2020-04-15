package com.cognizant.vehicle.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.vehicle.dao.RegisterDao;
import com.cognizant.vehicle.dao.RegisterDaoImpl;
import com.cognizant.vehicle.model.Register;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RegisterDao rg = new RegisterDaoImpl();
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		Register reg = rg.getLogin(id, password);

		if (reg != null && reg.getId() != null && reg.getUserType().equalsIgnoreCase("admin")) {
			request.setAttribute("message", reg.getFirstName());
			request.getRequestDispatcher("Admin_Home.jsp").forward(request, response);
		} else if (reg != null && reg.getId() != null && reg.getUserType().equalsIgnoreCase("user")
				&& reg.getStatus().equalsIgnoreCase("approved")) {
			request.setAttribute("message", reg.getFirstName());
			request.getRequestDispatcher("User_Home.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Data Not Found");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}

	}

}
