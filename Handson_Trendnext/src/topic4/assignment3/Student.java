package topic4.assignment3;

import java.util.List;

public class Student 
{
private int student_id;
private String student_name;
private List<Course> course;
public Student() {}
public Student(String student_name,List<Course> course) {
	super();
	this.course=course;
	this.student_name = student_name;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List <Course>course) {
	this.course = course;
}
}
