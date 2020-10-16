package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
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
		LoginDao loginDao = new LoginDao();
		PrintWriter out=response.getWriter();  
		
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUname(username);
		loginBean.setPassword(password);
		
		try {
			if (loginDao.validate(loginBean))
			{
				response.sendRedirect("list");
				HttpSession session = request.getSession();
				session.setAttribute("uname",username);
				
			}
			else 
			{
				out.print("Sorry, username or password error!");  
				request.getRequestDispatcher("login.jsp").include(request, response); 
//				HttpSession session = request.getSession();
//				session.setAttribute("user", username);
//				response.sendRedirect("login.jsp");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}