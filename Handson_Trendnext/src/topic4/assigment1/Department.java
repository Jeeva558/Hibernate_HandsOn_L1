package topic4.assigment1;

import java.util.List;

public class Department 
{
private int id;
private String departmentname;
private List employee;
public Department(String departmentname, List employee) {
	super();
	this.departmentname = departmentname;
	this.employee = employee;
}
public List getEmployee() {
	return employee;
}
public void setEmployee(List employee) {
	this.employee = employee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
}
