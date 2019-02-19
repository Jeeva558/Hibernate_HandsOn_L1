package topic2.assignment1;

public class Employee2 
{
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeBand;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeBand() {
		return EmployeeBand;
	}
	public Employee2(int employeeID, String employeeName, String employeeBand) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeBand = employeeBand;
	}
	public Employee2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee2 [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", EmployeeBand="
				+ EmployeeBand + "]";
	}
	public void setEmployeeBand(String employeeBand) {
		EmployeeBand = employeeBand;
	}
}
