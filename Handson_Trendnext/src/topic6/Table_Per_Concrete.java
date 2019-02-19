package topic6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Table_Per_Concrete 
{
	private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	public static void SaveEmployee()
	{
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("Inserting Employee Details Using Table per concrete class Approach");
		Employee emp=new Employee();
		emp.setEmployeeID(393537);
		emp.setEmployeeName("Jeeva");
		emp.setEmployeeSalary(60000);
		RegularEmployee remp=new RegularEmployee();
		remp.setEmployeeID(495637);
		remp.setEmployeeName("Karthick");
		remp.setEmployeeSalary(70000);
		remp.setqplc(4000);
		ContractEmployee cemp=new ContractEmployee();
		cemp.setEmployeeID(596308);
		cemp.setEmployeeName("Mahesh");
		cemp.setEmployeeSalary(80000);
		cemp.setAllowance(100000);
		session.persist(emp);
		session.persist(remp);
		session.persist(cemp);
		tx.commit();
		session.close();
		System.out.println("<-----------Completed------------>");
		
	}
	
	public static void main(String[] args) 
	{
	SaveEmployee();
	}
}
