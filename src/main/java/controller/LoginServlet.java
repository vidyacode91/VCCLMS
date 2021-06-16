package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.LibrarianLoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (LibrarianLoginDao.validate(username, password)) {
			out.print("login Successful");
			RequestDispatcher rs = request.getRequestDispatcher("librarianhome.jsp");
			rs.forward(request, response);

		} else {
			out.print("Sorry invalid username or password");
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.include(request, response);
		}
		out.close();*/

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (LibrarianLoginDao.validate(username, password)) {
			
			RequestDispatcher rs = request.getRequestDispatcher("librarianhome.jsp");
			rs.forward(request, response);
			out.print("login Successful" + username);
             // Handle sessions here
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			session.setAttribute("password",password);
		} else {
			out.print("Sorry invalid username or password");
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.include(request, response);
		}
		out.close();

	}
}
