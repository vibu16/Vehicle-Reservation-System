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
 * Servlet implementation class LoginRegisterServlet
 */
@WebServlet("/LoginRegisterServlet")
public class LoginRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginRegisterServlet() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RegisterDao rg = new RegisterDaoImpl();
<<<<<<< HEAD
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		Register reg = rg.getRegistration(id, password);
		if (submitType.equals("Login") && reg != null && reg.getId()!=null) {
=======
		String vendorId = request.getParameter("id");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		Register reg = rg.getRegistration(vendorId, password);
		if (submitType.equals("Login") &&  reg != null &&reg.getVendorId()!=null) {
>>>>>>> 3e62fd4945994d03a13a2bb4d6e9c5e40a7c952c
			request.setAttribute("message", reg.getFirstName());
			request.getRequestDispatcher("Admin_Home.jsp").forward(request, response);
		}else if (submitType.equals("Register")) {
				try {
<<<<<<< HEAD
					reg.setId(id);
=======
					reg.setVendorId(vendorId);
>>>>>>> 3e62fd4945994d03a13a2bb4d6e9c5e40a7c952c
					reg.setPassword(password);
					reg.setFirstName(request.getParameter("firstName"));
					reg.setLastName(request.getParameter("lastName"));
					reg.setAge(Integer.parseInt(request.getParameter("age")));
					reg.setGender((request.getParameter("gender")));
					reg.setContactNumber(Integer.parseInt(request.getParameter("number")));
					reg.setEmail(request.getParameter("emailId"));
<<<<<<< HEAD
					reg.setUserType((request.getParameter("usertype")));
					reg.setSecurityQuestion(request.getParameter("answer"));
					reg.setBranch(request.getParameter("branch"));
					//reg.setStatus("pending");
=======
					reg.setSecurityQuestion(request.getParameter("question"));
					reg.setSecurityQuestion(request.getParameter("answer"));
					reg.setBranch(request.getParameter("branch"));
>>>>>>> 3e62fd4945994d03a13a2bb4d6e9c5e40a7c952c
					rg.registration(reg);
					request.setAttribute("success", "Registration done");
					request.getRequestDispatcher("Index.jsp").forward(request, response);
				} catch (Exception e) {
					System.out.println(e);

				}
			} else {

				request.setAttribute("msg", "Data Not Found");
				request.getRequestDispatcher("Login.jsp").forward(request, response);

			}
		}
	}

