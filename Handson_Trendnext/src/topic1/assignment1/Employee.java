package topic1.assignment1;

public class Employee 
{
	private String name;
	private int EmpID;
	private String Designation;
	private int Salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmpID=" + EmpID + ", Designation=" + Designation + ", Salary=" + Salary
				+ "]";
	}
}
