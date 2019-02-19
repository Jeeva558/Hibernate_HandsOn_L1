package topic3.assignment1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class QuestionService
{
	private static SessionFactory sessiofactory=HibernateUtil.getSessionFactory();
	public static void saveQuestions(String qname,List options,String answer)
	{
		System.out.println("Saving Question to table");
		Session session=sessiofactory.openSession();
		Transaction tx=session.beginTransaction();
		Question que=new Question(qname, options, answer);
		session.save(que);
		tx.commit();
		session.close();
		System.out.println("Question Saved Successfully");
	}
	public static void main(String[] args) 
	{
	List l1=new ArrayList();
	l1.add(new Options("Ascending order"));
	l1.add(new Options("Descending order"));
	l1.add(new Options("Random order"));
	String q1="What is the order of variables in Enum?";
	String answer="Ascending order";
	saveQuestions(q1, l1, answer);
	
	}
}
