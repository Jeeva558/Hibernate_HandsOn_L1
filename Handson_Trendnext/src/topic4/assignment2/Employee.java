package topic4.assignment2;

public class Employee 
{

private int Employee_ID;
private String Employee_name;
private Passport pass;
public Employee() {}
public Employee( String employee_name) {
	super();
	
	Employee_name = employee_name;
	
}

public Passport getPass() {
	return pass;
}

public void setPass(Passport pass) {
	this.pass = pass;
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
