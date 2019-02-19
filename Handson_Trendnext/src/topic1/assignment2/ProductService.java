package topic1.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;


public class ProductService 
{
	private static List<Product> list=new ArrayList<Product>();
	private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
public static void saveProduct()
{
	Session session=sessionfactory.openSession();
addlist("Biscuit", 15);	
addlist("jam", 150);	
addlist("Rice", 1500);	
addlist("chips", 15);	
addlist("chocolate", 45);	
addlist("ButterMilk", 10);	
addlist("Wafer", 20);	
addlist("Shampoo", 75);	
addlist("Soap", 35);	
addlist("Drinks", 40);	
System.out.println("Saving Product Details");
Transaction tx=session.beginTransaction();
Iterator<Product> it=list.iterator();
while(it.hasNext())
{
	Product psave=it.next();
	session.save(psave);
}
tx.commit();
session.close();
System.out.println("Product Details Saved");

	
	
}
public static void addlist(String pname,int price)
{
	Product p=new Product(pname,price);
	list.add(p);
	
}
public static void main(String[] args) {
	saveProduct();
}
}
