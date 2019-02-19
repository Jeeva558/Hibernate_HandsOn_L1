package topic2.assignment2;

import java.util.Date;

public class Employee3 
{
	private int Empcode;
	private String Empname;
	private String Empdesignation;
	private Date EmpDOB;
	private Date EmpJOD;
	private int Empage;
	private double Empbasicpay;
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
	public Date getEmpDOB() {
		return EmpDOB;
	}
	public void setEmpDOB(Date empDOB) {
		EmpDOB = empDOB;
	}
	public Date getEmpJOD() {
		return EmpJOD;
	}
	public void setEmpJOD(Date empJOD) {
		EmpJOD = empJOD;
	}
	public int getEmpage() {
		return Empage;
	}
	public void setEmpage(int empage) {
		Empage = empage;
	}
	public double getEmpbasicpay() {
		return Empbasicpay;
	}
	public void setEmpbasicpay(double empbasicpay) {
		Empbasicpay = empbasicpay;
	}
	public Employee3(String empname, String empdesignation, Date empDOB, Date empJOD, int empage,
			double empbasicpay) {
		super();
		
		Empname = empname;
		Empdesignation = empdesignation;
		EmpDOB = empDOB;
		EmpJOD = empJOD;
		Empage = empage;
		Empbasicpay = empbasicpay;
	}
	
	public Employee3()
	{
		
	}
	
}
