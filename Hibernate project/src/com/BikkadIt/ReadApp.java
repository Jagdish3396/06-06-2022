package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadApp {
	public static void main(String[] args) {
		// create configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// create sessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// initialize session object
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// Employee employee = session.get(Employee.class, 30);//fot get method
		// if you are passing primary id which is not availble in database entry it will
		// return null
		//Employee employee2 = session.get(Employee.class, 10);
		Employee employee = session.load(Employee.class, 50);// for load method
		// org.hibernate.ObjectNotFoundException this error coming is we are passing a
		// primary key whose entry is
		// not available in database.
		System.out.println(employee);
		session.getTransaction().commit();

	}

}

