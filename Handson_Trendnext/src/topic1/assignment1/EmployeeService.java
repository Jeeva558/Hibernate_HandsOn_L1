package topic1.assignment1;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jboss.jandex.Main;


import util.HibernateUtil;

public class EmployeeService 
{
 private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
 public static void saveEmployee()
 {
	 Session session=sessionfactory.openSession();
	 Employee emp1=new Employee();
	 emp1.setName("Jeeva");
	 emp1.setSalary(85000);
	 emp1.setDesignation("Project Engineer");
	Employee emp2=new Employee();
	 emp2.setName("Bala");
	 emp2.setSalary(75000);
	 emp2.setDesignation("Trainee Engineer");
	 Employee emp3=new Employee();
	 emp3.setName("Arjun");
	 emp3.setSalary(65000);
	 emp3.setDesignation("Technical Lead");
	 Employee emp4=new Employee();
	 emp4.setName("Karthick");
	 emp4.setSalary(95000);
	 emp4.setDesignation("Manager");
	 Employee emp5=new Employee();
	 emp5.setName("Mahesh");
	 emp5.setSalary(105000);
	 emp5.setDesignation("Technical Writer");
	 System.out.println("Saving Employee Details");
	 System.out.println(emp1);
	System.out.println(emp2);
	  System.out.println(emp3);
	 System.out.println(emp4);
	 System.out.println(emp5);
	 session.clear();
	 List<Employee> emp=new ArrayList<Employee>();
	 emp.add(emp1);
	 emp.add(emp2);
	 emp.add(emp3);
	 emp.add(emp4);
	 emp.add(emp5);
	 Transaction tx=session.beginTransaction();
	 Iterator<Employee> it=emp.iterator(); 
     while(it.hasNext())
     {
    	 Employee empsave=it.next(); 
    	 session.save(empsave);
     }
	 
	 tx.commit();
	 session.close();
	 System.out.println("Employee Details saved");
	 	 
 }
 public static void main(String[] args) {
	saveEmployee();
}
}
