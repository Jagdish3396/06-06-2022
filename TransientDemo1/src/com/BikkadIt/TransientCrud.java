package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class TransientCrud {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		/*OldStudent o=new OldStudent();
		o.setId(10);
		o.setName("jagdish");
		o.setAddress("Pune");
		o.setEmail("bornarejagdish8@gmail.com");
		
		OldStudent o1=new OldStudent();
		o1.setId(20);
		o1.setName("Sagar");
		o1.setAddress("Yeola");
		o1.setEmail("deshmukhsagar@gmail.com");
		
		
		session.beginTransaction();
		session.save(o);
		session.save(o1);
		session.getTransaction().commit();*/
		String sql="insert into Student(id,name,address)"+"select id,name,address from OldStudent";
		session.beginTransaction();
		Query query = session.createQuery(sql);
		int i=query.executeUpdate();
		session.getTransaction().commit();
		System.out.println(i);
		
		
	}

}
