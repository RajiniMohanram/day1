package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JoinCourses
 */
@WebServlet("/join-courses.do")
public class JoinCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] userChoices = request.getParameterValues("course");
		HttpSession session = request.getSession();
		Map<String,String> userCourses = (Map<String,String>)session.getAttribute("userCourses");
		for(String c :userChoices) {
			userCourses.put(c, c);
		}
		session.setAttribute("userCourses", userCourses);
		RequestDispatcher rd = request.getRequestDispatcher("mycourses.jsp");
		rd.forward(request, response);
	}

}
