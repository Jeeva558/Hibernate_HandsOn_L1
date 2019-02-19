package topic4.assigment1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import topic3.assignment1.Options;
import topic3.assignment1.Question;
import util.HibernateUtil;

public class DepartmentService 
{
	private static SessionFactory sessiofactory=HibernateUtil.getSessionFactory();
	public static void saveQuestions(String departmentname,List employee)
	{
		System.out.println("Saving Department to table");
		Session session=sessiofactory.openSession();
		Transaction tx=session.beginTransaction();
		Department dep=new Department(departmentname, employee);
		session.save(dep);
		tx.commit();
		session.close();
		System.out.println("Department Saved Successfully");
	}
	public static void main(String[] args) 
	{
	List l1=new ArrayList();
	l1.add(new Employee(393537, "Jeeva"));
	l1.add(new Employee(373737, "Karthick"));
	
	
	String departmentname="Development";
	saveQuestions(departmentname,l1);
	
	}
}
