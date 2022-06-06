package com.BikkadIt;

//note:project named with one to many mapping is same project
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Department d1 = new Department();
		d1.setDname("Sales");

		Employee e1 = new Employee();
		e1.setEname("Jagdish");
		e1.setEaddr("pune");
		e1.setE_des("sr engg");
		e1.setDepartment(d1);

		Employee e2 = new Employee();
		e2.setEname("Nitesh");
		e2.setEaddr("satana");
		e2.setE_des("It engineer");
		e2.setDepartment(d1);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		d1.setEmployees(list);

		session.beginTransaction();
		session.save(d1);
		//session.save(e1);
		//session.save(e2);

		session.getTransaction().commit();

	}

}
