package com.fil.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfProvider
{
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;
	
	public static EntityManager getEntityManager()
	{
		if(emf == null || ! emf.isOpen())
		{
			emf = Persistence.createEntityManagerFactory("fil24PU");
			em = emf.createEntityManager();
			return em;
		}
		return em;
	}

}
