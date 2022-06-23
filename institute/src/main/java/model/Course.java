package model;

public class Course {
	private String courseCode;
	private String courseName;
	private int duration;
	private double fees;
	
	public Course() {}
	
	public Course(String courseCode, String courseName, int duration, double fees) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
