package topic4.assignment3;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class StudentService 
{
private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
public static void saveStudent(String student_name,List<Course> course)
{
	System.out.println("Inserting Student and Course");
	Session session=sessionfactory.openSession();
	Transaction tx=session.beginTransaction();	
	Student stu=new Student(student_name,course);
	session.persist(stu);
	tx.commit();
	session.close();
	System.out.println("Successfully Inserted");
	
}
public static void main(String[] args) 
{
Course c1=new Course("PHP", 9000);
Course c2=new Course("Oracle", 6000);
List<Course> course=Arrays.asList(c1,c2);
saveStudent("Kathick",course);

}
}
