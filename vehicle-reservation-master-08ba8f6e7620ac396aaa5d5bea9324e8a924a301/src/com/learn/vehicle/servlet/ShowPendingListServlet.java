package com.learn.vehicle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.vehicle.dao.UserDao;
import com.learn.vehicle.dao.UserDaoImpl;
import com.learn.vehicle.model.User;

/**
 * Servlet implementation class ShowPendingListServlet
 */
@WebServlet({ "/ShowPendingListServlet", "/ShowPendingList" })
public class ShowPendingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPendingListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UserDao adminPending = new UserDaoImpl();
            List<User> pending = adminPending.getUser();
            request.setAttribute("pending", pending);
            RequestDispatcher rd = request.getRequestDispatcher("User_Approval.jsp");
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
