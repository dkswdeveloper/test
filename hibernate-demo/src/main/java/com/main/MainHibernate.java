package com.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.fil.dao.EmfProvider;

public class MainHibernate
{
	private static Logger logger = Logger.getLogger("com.main");
	public static void main(String[] args)
	{
		System.out.println("project is running");
		EntityManager em = EmfProvider.getEntityManager();
		em.getTransaction().begin();
//		Employee employee = em.find(Employee.class,1);
//		System.out.println(employee);
//		Department dept = employee.getDept();
//		System.out.println(employee.getDept());
//		Parking parking = new Parking(0, 1, 1);
//		em.persist(parking);
//		System.out.println(parking);
//		Parking parking2 = em.find(Parking.class,1001);
//		System.out.println(parking2);
//		parking2.setEmployee(employee);
//		Department hrDept = em.find(Department.class, "hr");
//		System.out.println(hrDept);
//		List<Employee> employees = hrDept.getEmployees();
//		System.out.println(employees);
		
//		MyTest test =new MyTest(0, "DBMS TEST");
//		em.persist(test);
//		Department hr = new Department("hr", "floor 1");
//		Department acc = new Department("acc", "floor 2");
//		em.persist(acc);
//		em.persist(hr);
		
//		Project project = em.find(Project.class, 1);
//		List<Employee> employees = project.getEmployees();
//		System.out.println(project);
//		System.out.println(employees);
//		
//		Employee emp1 = em.find(Employee.class, 1);
//		Employee emp2 = em.find(Employee.class, 2);
//		Employee empDetached = new Employee(0, "New Empl2", null, null, "929898989898",40000,"M");
//		em.persist(empDetached);
//		employees.add(empDetached);
//		employees.add(emp1);
//		employees.add(emp2);
//		em.persist(project);
//		Employee emp1 = em.find(Employee.class,1);
//		emp1.setName("Dhruv Sharma");
//		Faculty faculty = new Faculty(0, "Sukhman", "ashu@gam.com",234,"AP");
//		LibStudent student = new LibStudent(0, "Pranjali", "yash@gma.com",999,"CSE");
//		Member member = new Member(0,"Sanskar", "san@g.c");
//		em.persist(member);
//		em.persist(student);
//		em.persist(faculty);
		
//		Person p1 =new Person(0, "Ekta");
//		em.persist(p1);
//		Consumer cons = new Consumer(0, "Dhruv", "Gurugram", 4.5);
//		em.persist(cons);
//		EmployeeInh emp = new EmployeeInh(0, "Alik", 123,"SD");
//		em.persist(emp);
		
		em.getTransaction().commit();
//		Query query = em.createQuery("select m from Person m");
		Query query = em.createQuery("select s from Person s");
		List list = query.getResultList();
		list.forEach(logger::trace);
	}
	
}
