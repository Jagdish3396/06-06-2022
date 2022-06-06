package com.BikkadIt;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee e1 = new Employee();
		e1.setEid(111);
		e1.setEname("Jagdish");
		Employee e2 = new Employee();
		e2.setEid(222);
		e2.setEname("Satish");

		Project p1 = new Project();
		p1.setPid(10);
		p1.setPname("IES");// (Integrated Eligibility System)
		Project p2 = new Project();
		p2.setPid(20);
		p2.setPname("PMS");

		List<Employee> elist = new ArrayList<>();
		elist.add(e1);
		elist.add(e2);

		List<Project> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);

		e1.setProject(plist);
		p2.setEmployee(elist);

		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
	}
}