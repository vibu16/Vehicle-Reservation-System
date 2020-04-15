package com.learn.vehicle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.vehicle.dao.UserDao;
import com.learn.vehicle.dao.UserDaoImpl;
import com.learn.vehicle.model.User;

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
		UserDao rg = new UserDaoImpl();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		System.out.println(id);
		
		User reg = rg.getUser(id, password);

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
