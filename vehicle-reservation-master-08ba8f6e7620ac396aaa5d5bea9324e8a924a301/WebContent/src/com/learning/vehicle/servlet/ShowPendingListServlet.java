package com.cognizant.vehicle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.vehicle.dao.RegisterDao;
import com.cognizant.vehicle.dao.RegisterDaoImpl;
import com.cognizant.vehicle.model.Register;

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
            RegisterDao adminPending = new RegisterDaoImpl();
            List<Register> pending = adminPending.getAdmin();
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
