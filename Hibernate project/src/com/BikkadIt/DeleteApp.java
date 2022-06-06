package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteApp {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*Employee e = new Employee();
		e.setEmpid(20);
		session.beginTransaction();
		session.delete(e);
		session.getTransaction().commit();*/
		Employee employee = session.get(Employee.class, 50);
		employee.setEmpid(30);
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction();
	}

}
