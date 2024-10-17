package com.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fil.dao.EmfProvider;
import com.main.model.Department;
import com.main.model.Employee;
import com.main.model.MyTest;
import com.main.model.Parking;
import com.main.model.Project;
import com.main.model.Student;

public class MainHibernate
{
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
		Employee emp1 = em.find(Employee.class,1);
		emp1.setName("Dhruv Sharma");
		
		em.getTransaction().commit();
	}
	
}
