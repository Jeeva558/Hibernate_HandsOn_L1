package topic5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;

public class CarService 
{
	private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	public static void saveCars(List<Car> car)
	{
		System.out.println("Inserting Car Details");
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		for(Iterator it=car.iterator();it.hasNext();)
		{
			Car c=(Car) it.next();
			session.save(c);
		}
		tx.commit();
		session.close();
		System.out.println("Car Details Saved Successfully");
	}
	public static void listCars()
	{
		System.out.println("Listing Car Details");
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		List<Car> list=session.createQuery("FROM Car").list();
		for(Iterator it=list.iterator();it.hasNext();)
		{
			Car c=(Car) it.next();
			System.out.println("RegNo = "+c.getRegNo()+" Model = "+c.getModel()+" Color = "+c.getColor()+" Manufacturer = "+c.getManufacturer()+" Price = "+c.getPrice());
		}
		System.out.println("<-----------Completed------------>");
	}
	public static void listCars_withV()
	{
		System.out.println("Listing Car Details With Starting V");
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Car.class);
		criteria.add(Restrictions.like("Manufacturer", "V%"));
		List list=criteria.list();
		//List<Car> list=session.createQuery("FROM Car WHERE MANUFACTURER LIKE \"V%\"").list();
		for(Iterator it=list.iterator();it.hasNext();)
		{
			Car c=(Car) it.next();
			System.out.println("RegNo = "+c.getRegNo()+" Model = "+c.getModel()+" Color = "+c.getColor()+" Manufacturer = "+c.getManufacturer()+" Price = "+c.getPrice());
		}
		tx.commit();
		session.close();
		System.out.println("<-----------Completed------------>");
	}
	public static void CarDetails(String RegNo)
	{
		System.out.println("Entered Reg No = "+RegNo);
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Car.class);
		criteria.add(Restrictions.like("RegNo", RegNo));
		List list=criteria.list();
		//List<Car> list=session.createQuery("FROM Car WHERE MANUFACTURER LIKE \"V%\"").list();
		for(Iterator it=list.iterator();it.hasNext();)
		{
			Car c=(Car) it.next();
			System.out.println("RegNo = "+c.getRegNo()+" Model = "+c.getModel()+" Color = "+c.getColor()+" Manufacturer = "+c.getManufacturer()+" Price = "+c.getPrice());
		}
		tx.commit();
		session.close();
		System.out.println("<-----------Completed------------>");
	}
	public static void BasedOnPrice()
	{
		System.out.println("Listing Car Which are Less than 6Lacs");
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Car.class);
		criteria.add(Restrictions.lt("Price", 600000));
		List list=criteria.list();
		//List<Car> list=session.createQuery("FROM Car WHERE MANUFACTURER LIKE \"V%\"").list();
		for(Iterator it=list.iterator();it.hasNext();)
		{
			Car c=(Car) it.next();
			System.out.println("RegNo = "+c.getRegNo()+" Model = "+c.getModel()+" Color = "+c.getColor()+" Manufacturer = "+c.getManufacturer()+" Price = "+c.getPrice());
		}
		tx.commit();
		session.close();
		System.out.println("<-----------Completed------------>");
	}
public static void main(String[] args) 
{
	
/*Car c1=new Car("KL-07 AB 123", "Polo", "White", "Volkswagen",700000 );
Car c2=new Car("KL-07 AB 234", "Vento", "Black", "Volkswagen", 600000);
Car c3=new Car("KL-07 AC 345", "Corolla", "Silver", "Toyota", 1000000);
Car c4=new Car("KL-07 BC 123", "Sail Uva", "Red", "Chevrolet",500000 );
List<Car> car=Arrays.asList(c1,c2,c3,c4);
saveCars(car);*/
//listCars();
//listCars_withV();
//CarDetails("KL-07 AB 123");
BasedOnPrice();
	
}
}
