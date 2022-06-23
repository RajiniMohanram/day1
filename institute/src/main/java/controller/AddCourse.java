package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Course;

/**
 * Servlet implementation class AddCourse
 */
@WebServlet("/add-course.do")
public class AddCourse extends HttpServlet {
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
		ServletContext ctx = request.getServletContext();
		Map<String,Course> allCourses = (Map<String,Course>)ctx.getAttribute("courses");
		
		String courseCode = request.getParameter("courseCode");
		String courseName = request.getParameter("courseName");
		int duration = Integer.parseInt(request.getParameter("duration"));
		double fees = Double.parseDouble(request.getParameter("fees"));
		
		Course course = new Course(courseCode, courseName, duration, fees);
		allCourses.put(course.getCourseCode(), course);
		ctx.setAttribute("courses", allCourses);
		
		RequestDispatcher rd = request.getRequestDispatcher("add-course.jsp");
		rd.forward(request, response);
	}

}
