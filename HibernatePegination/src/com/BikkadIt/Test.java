package com.BikkadIt;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Student s1 = new Student();
		s1.setSid(10);
		s1.setSname("Jagdish");
		s1.setSadd("Pune");

		Student s2 = new Student();
		s2.setSid(11);
		s2.setSname("Nitesh");
		s2.setSadd("Satara");

		Student s3 = new Student();
		s3.setSid(12);
		s3.setSname("Sagar");
		s3.setSadd("Satana");

		Student s4 = new Student();
		s4.setSid(13);
		s4.setSname("Samadhan");
		s4.setSadd("nashik");

		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.getTransaction().commit();

		String hql = "from Student";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(5);
		List<Student> list = query.list();
		for (Student s : list)
		{
			System.out.println(s);
		}
		
		
		}
	}
