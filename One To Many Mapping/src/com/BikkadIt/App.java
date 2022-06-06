package com.BikkadIt;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Department dpt = new Department();
		dpt.setDname("etc");

		Employee emp = new Employee();
		emp.setEname("Jagdish");
		emp.setEaddress("Vaijapur");
		emp.setEdesignation("engineer");
		emp.setDepartment(dpt);

		Employee emp1 = new Employee();
		emp1.setEname("sagar");
		emp1.setEaddress("pune");
		emp1.setEdesignation("sr engineer");
		emp1.setDepartment(dpt);

		List<Employee> list = new ArrayList();
		list.add(emp);
		list.add(emp1);
		dpt.setEmployees(list);
		session.beginTransaction();
		session.save(dpt);
		session.save(emp);
		session.save(emp1);

		session.getTransaction().commit();

	}

}
