package topic4.assignment2;

import java.util.Date;

public class Passport 
{
private int id;
private int passport_number;
private Date DOB;
private Employee employee;



public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPassport_number() {
	return passport_number;
}
public void setPassport_number(int passport_number) {
	this.passport_number = passport_number;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}

public Passport(){}


public Passport(int id, int passport_number, Date dOB) {
	super();
	this.id = id;
	this.passport_number = passport_number;
	DOB = dOB;
	
	
}

}
