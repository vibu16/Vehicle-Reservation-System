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
 * Servlet implementation class AdminRejectServlet
 */
@WebServlet({ "/AdminRejectServlet", "/AdminReject" })
public class AdminRejectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRejectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
            
            String userId =request.getParameter("id");
            String status ="reject";
            User r = new User(userId,status);
            UserDao adminDao = new UserDaoImpl();
            adminDao.approveAdmin(r);
            request.setAttribute("rej", "Member Rejected");
			request.getRequestDispatcher("ShowPendingList").forward(request, response);
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
