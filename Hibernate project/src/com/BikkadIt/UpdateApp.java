package com.BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*
		 * if we are updating with following method then perticular column getting
		 * update but rest of the column value for the primary id we mentioned is
		 * getting lost ie it returns zero or null for other columns. Employee e=new
		 * Employee(); e.setEmpid(20); e.setEmpname("ramesh");
		 * session.beginTransaction(); session.update(e);
		 * session.getTransaction().commit();
		 */
		Employee employee = session.get(Employee.class, 50);// with this method we can update perticular column without
		// losting data of other column for perticular primary id.
		session.beginTransaction();
		employee.setEmpname("sandip");
		session.update(employee);

		session.getTransaction().commit();

	}

}
