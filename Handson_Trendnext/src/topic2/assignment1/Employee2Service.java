package topic2.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Employee2Service 
{
private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
public static  void saveEmployee()
{
	Session session=sessionfactory.openSession();
	List<Employee2> list=new ArrayList<Employee2>();
	addlist(list, 1234, "Nandhu", "Student");
	addlist(list, 2468, "Jeeva", "B1");
	addlist(list, 3692, "Karthick", "TEAMRBOW");
	addlist(list, 4826, "Mahesh", "B2");
	
	System.out.println("Saving Employee Details");
	Transaction tx=session.beginTransaction();
	Iterator<Employee2> it=list.iterator();
	while(it.hasNext())
	{
		Employee2 emp2=it.next();
		session.save(emp2);
	}
	tx.commit();
	session.close();
	System.out.println("Employee Details saved");
}
public static void deleteEmployee(int empID)
{
	System.out.println("Deleting Employee Detail");
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	Employee2 demp=session.get(Employee2.class, empID);
	session.delete(demp);
	tx.commit();
	session.close();
	System.out.println("Employee Detail Deleted");
}
public static void  updateEmployee(int empID,String empBand)
{
	System.out.println("Updating Employee Detail");
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	Employee2 uemp=session.get(Employee2.class,empID);
	uemp.setEmployeeBand(empBand);
	session.update(uemp);
	tx.commit();
	System.out.println("Updated Employee Detail");
	session.close();
}
public static void readEmployee()
{
	System.out.println("Listing Employee Details");
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	List remp=session.createQuery("FROM Employee2").list();
	Iterator<Employee2> it=remp.iterator();
	while(it.hasNext())
	{
		Employee2 emp=it.next();
		System.out.println("Employee ID : "+emp.getEmployeeID());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Band : "+emp.getEmployeeBand());
	}
	tx.commit();
	session.close();
	System.out.println("Listed All Employee Details");
}
public static void addlist(List list,int employeeID,String employeeName, String employeeBand)
{
	Employee2 emp=new Employee2(employeeID, employeeName, employeeBand);
	list.add(emp);
}
public static void main(String[] args) 
{
	//saveEmployee();
	//deleteEmployee(3692);
	//updateEmployee(1234, "C1");
	readEmployee();
}
}
