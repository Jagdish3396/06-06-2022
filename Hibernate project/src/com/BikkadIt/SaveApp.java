package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
	//	Session session = sessionFactory.openSession();

		/*Employee e = new Employee();
		e.setEmpid(10);
		e.setEmpname("jagdish");
		e.setEmpsal(50000);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();*/
		
		Session session2 = sessionFactory.openSession();
		Employee e1 = new Employee();
		e1.setEmpid(20);
		e1.setEmpname("Nitesh");
		e1.setEmpsal(70000);
		session2.beginTransaction();
		session2.save(e1);
		session2.getTransaction().commit();
		
		/*Session session3 = sessionFactory.openSession();
		Employee e2=new Employee();
		e2.setEmpid(30);
		e2.setEmpname("mahesh");
		e2.setEmpsal(80000);
		session3.beginTransaction();
		session3.save(e2);
		session3.getTransaction().commit();*/
		Session session3 = sessionFactory.openSession();

		Employee e2 = new Employee();
		e2.setEmpid(50);
		e2.setEmpname("sagar");
		e2.setEmpsal(60000);
		session3.beginTransaction();
		session3.save(e2);
		session3.getTransaction().commit();
		
		
		

	}

}
