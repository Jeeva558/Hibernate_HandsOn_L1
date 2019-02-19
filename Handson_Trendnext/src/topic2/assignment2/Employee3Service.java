package topic2.assignment2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.EnumUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Employee3Service 
{
	enum designation
		{
		SE,SSE,SS,SSS;
		}
private static SessionFactory sessiofactory=HibernateUtil.getSessionFactory();
public static void saveemployee(String empname,String empdesignation,Date empdob,Date empjod,int empage,double empbasicpay) 
{
	System.out.println("Data Insertion Method started");
	Calendar startdate=new GregorianCalendar();
	startdate.setTime(empdob);
	Calendar enddate=new GregorianCalendar();
	enddate.setTime(empjod);
	int calculated_age=Math.abs(startdate.get(Calendar.YEAR)-enddate.get(Calendar.YEAR));
	int name_length=empname.length();
	
	
	try
	{
		if(EnumUtils.isValidEnum(designation.class, empdesignation))
		{
			if(empage>=18&&empage<=60)
			{
				if(empbasicpay>=6000&&name_length<=20)
				{
					if(calculated_age>=18)
					{
					Session session=sessiofactory.openSession();
					Transaction tx=session.beginTransaction();
					Employee3 emp=new Employee3(empname,empdesignation,empdob,empjod,empage,empbasicpay);
					session.save(emp);
					tx.commit();
					session.close();
					System.out.println("Employee Data Saved Successfully");
					}
					else
					{
						System.out.println("Please Enter The valid Joining and Birth date");
					}
				}
				else
				{
					System.out.println("Please Enter the valid Basicpay or Name within 20 Characters");
				}
			}
			else
			{
				System.out.println("Please Enter the valid age");
			}
		}
		else
		{
			System.out.println("Please Enter the valid designation");
		}
		 
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
}
public static void deleteemployee(int empcode,Date leavingdate)
{
	System.out.println("Employee Deleting stage started");
	Session session=sessiofactory.openSession();
	Transaction tx=session.beginTransaction();
	Employee3 emp3=session.get(Employee3.class, empcode);
	String empname=emp3.getEmpname();
	String empdesign=emp3.getEmpdesignation();
	double salary=emp3.getEmpbasicpay();
	EmployeeLogTab empltab=new EmployeeLogTab(empcode, empname, empdesign, leavingdate, salary);
	session.save(empltab);
	session.delete(emp3);
	tx.commit();
	session.close();
	System.out.println("Employee Deleted successfuly");
	
}
public static void main(String[] args) 
{
	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
	String empdob="1995-03-21";
	String empjod="2017-12-21";
	String leadate="2019-04-02";
	Date leavingdate;
	Date dobdate;
	Date joddate;
	/*try {
		dobdate = (Date) sf.parse(empdob);
		joddate=(Date) sf.parse(empjod);
		saveemployee("Nandhu", "SSS",dobdate ,joddate, 22,99000.96);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}*/
	try
	{
		leavingdate=sf.parse(leadate);
		deleteemployee(2, leavingdate);
	}
	catch (ParseException e) 
	{		
		e.printStackTrace();
	}
	

}
}
