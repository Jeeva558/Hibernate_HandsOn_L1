package topic3.assignment2;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ContinentService 
{
	private static SessionFactory sessiofactory=HibernateUtil.getSessionFactory();
	public static void savecontinent(String continent,String countryname,String capitalname)
	{
		System.out.println("Continent Insertion Method started");
		Session session=sessiofactory.openSession();
		Transaction tx=session.beginTransaction();
		Map<Country,Capital> map=new HashMap<Country,Capital>();
		map.put(new Country(countryname), new Capital(capitalname));
		Continent cn=new Continent(continent, map);
		session.save(cn);
		tx.commit();
		session.close();
		System.out.println("Continent Saved Succesfully");
	}
	public static void main(String[] args) 
	{
	savecontinent("Asia", "India", "Delhi");	
	}
}
