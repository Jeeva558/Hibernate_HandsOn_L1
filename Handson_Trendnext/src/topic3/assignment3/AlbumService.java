package topic3.assignment3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class AlbumService 
{
	private static SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	public static void SaveAlbum()
	{
		System.out.println("Insering Album Detail");
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Album album=new Album();
		album.setAname("Justin");
		List<String> list=Arrays.asList("m1","m2");
		Map<String,List<String>> map=new HashMap<>();
		map.put("Marriage", list);
		album.setPhotos(map);
		session.save(album);
		tx.commit();
		session.close();
		System.out.println("<-----------Completed------------>");
	}
	public static void main(String[] args) {
		SaveAlbum();
	}
}
