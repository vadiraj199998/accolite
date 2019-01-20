package com.au.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstSevlet
 */
@WebServlet(description = "My first servlet", urlPatterns = { "/FirstSevlet" })
public class FirstSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(request.getParameter("country"));
		response.setContentType("text/html");
		System.out.println(request.getParameter("country"));
		response.getWriter().append(request.getParameter("country"));
		HttpSession session=request.getSession();
		session.setAttribute("Country", request.getParameter("country"));
		
	}

}
