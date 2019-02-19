package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	public static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory()
    {
        try
        {
Configuration config = new Configuration( );
	 sessionFactory =config.configure("hibernate.cfg.xml").buildSessionFactory( );
        
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return sessionFactory;
    } 
}
