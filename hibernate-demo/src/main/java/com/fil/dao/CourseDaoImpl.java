package com.fil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.main.model.Course;

public class CourseDaoImpl implements CourseDao
{
	EntityManager em = EmfProvider.getEntityManager();
	@Override
	public Course findById(int cid)
	{
		return em.find(Course.class,cid);
	}

	@Override
	public List<Course> findAll()
	{
		// Native Query : SQL
		// Hibernate Query : HQL, JPA Query : JPQL
//		Query nativeQuery = em.createNativeQuery("select * from course");
//		List resultList = nativeQuery.getResultList();
		
		Query query = em.createQuery("from Course");
		List resultList = query.getResultList();
		return (List<Course>) resultList;
	}

	@Override
	public Course save(Course course)
	{
		em.persist(course);
		return course;
	}

}
