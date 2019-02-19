package topic4.assigment1;

public class Employee 
{
private int id;
private int Employee_ID;
private String Employee_name;
public Employee(int employee_ID, String employee_name) {
	super();
	Employee_ID = employee_ID;
	Employee_name = employee_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getEmployee_ID() {
	return Employee_ID;
}
public void setEmployee_ID(int employee_ID) {
	Employee_ID = employee_ID;
}
public String getEmployee_name() {
	return Employee_name;
}
public void setEmployee_name(String employee_name) {
	Employee_name = employee_name;
}
}
