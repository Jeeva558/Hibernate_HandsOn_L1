package topic2.assignment2;

import java.util.Date;

public class EmployeeLogTab 
{
	private int Empcode;
	private String Empname;
	private String Empdesignation;
	private Date Leavingdate;
	private double salary;
	
	public EmployeeLogTab(int empcode, String empname, String empdesignation, Date leavingdate2, double salary) {
		super();
		Empcode = empcode;
		Empname = empname;
		Empdesignation = empdesignation;
		Leavingdate = leavingdate2;
		this.salary = salary;
	}
	public int getEmpcode() {
		return Empcode;
	}
	public void setEmpcode(int empcode) {
		Empcode = empcode;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpdesignation() {
		return Empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		Empdesignation = empdesignation;
	}
	public Date getLeavingdate() {
		return Leavingdate;
	}
	public void setLeavingdate(Date leavingdate) {
		Leavingdate = leavingdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
