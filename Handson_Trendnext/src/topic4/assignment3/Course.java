package topic4.assignment3;

import java.util.List;

public class Course 
{
private int course_id;
private String course_name;
private int course_amount;
private List<Student> student;
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public int getCourse_amount() {
	return course_amount;
}
public void setCourse_amount(int course_amount) {
	this.course_amount = course_amount;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public Course() {}
public Course(String course_name, int course_amount) {
	super();
	this.course_name = course_name;
	this.course_amount = course_amount;
}

}
