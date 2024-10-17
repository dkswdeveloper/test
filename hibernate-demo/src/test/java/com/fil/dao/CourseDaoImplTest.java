package com.fil.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.main.model.Course;

class CourseDaoImplTest
{
	CourseDao courseDao = new CourseDaoImpl();

	@Test
	void testFindById()
	{
		Course course = courseDao.findById(1);
		System.out.println(course);
		assertNotNull(course);
		course = courseDao.findById(19898);
		System.out.println(course);
		assertNull(course);
		
	}
	@Test
	void testFindAll()
	{
		List<Course> courses = courseDao.findAll();
		System.out.println(courses);
//		assertEquals(6, courses.size());
		assertTrue(courses.size() >=6);
	}
	@Test
	void testSave()
	{
		EntityManager em = EmfProvider.getEntityManager();
		em.getTransaction().begin();
		Course course =new Course(0, "Hibernate", 10000, 50);
		Course savedCourse = courseDao.save(course);
		System.out.println(savedCourse);
		em.getTransaction().commit();
		assertNotNull(savedCourse);
	}
}
