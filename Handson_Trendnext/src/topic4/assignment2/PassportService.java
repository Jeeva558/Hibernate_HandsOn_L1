package topic4.assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class PassportService 
{
private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
public static void saveEmployee(String employee_name,int passport_number,Date dobdate)
{
	System.out.println("Inserting Passport Details");
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();
	Passport pass=new Passport();
	
	pass.setDOB(dobdate);
	pass.setPassport_number(passport_number);
	Employee emp=new Employee(employee_name);
	pass.setEmployee(emp);
	emp.setPass(pass);
	session.save(emp);
	session.save(pass);
	
	tx.commit();
	session.close();
	System.out.println("Passport Details saved Successfully");
}
public static void main(String[] args) {
	
	String employee_name="Jeeva";
	int passport_number=96325847;
	
	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
	String empdob="1995-03-21";
	Date dobdate;
	try {
		dobdate = (Date) sf.parse(empdob);
			
		saveEmployee( employee_name,passport_number,dobdate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
