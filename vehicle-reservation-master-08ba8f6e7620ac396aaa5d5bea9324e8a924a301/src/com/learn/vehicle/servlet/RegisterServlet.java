package com.learn.vehicle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.UserDao;
import com.learn.vehicle.dao.UserDaoImpl;
import com.learn.vehicle.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id=request.getParameter("id");          
			String firstName=request.getParameter("firstName");           
			String lastName=request.getParameter("lastName");            
			int age=(Integer.parseInt(request.getParameter("age")));                 
			String gender=request.getParameter("gender");              
			long contactNumber=Long.parseLong(request.getParameter("number"));       
			String email=request.getParameter("emailId");               
			String userType=request.getParameter("usertype");            
			String password=request.getParameter("password");            
			String branch=request.getParameter("branch");                       
			 
			
			
			User r=new User(id, firstName, lastName, age, gender, contactNumber, email, userType, password, branch);
			UserDao registerDao=new UserDaoImpl();
			registerDao.addUser(r);
			request.setAttribute("success", "Registration done");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}


	}
	}
