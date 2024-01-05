package servlet_crud10.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_crud10.dto.Dto;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(Dto d1) {
		et.begin();
		em.persist(d1);
		et.commit();

	}

	public String delete(int cid) {
		Dto d1 = em.find(Dto.class, cid);

		if (d1 != null) {
			et.begin();
			em.remove(d1);
			et.commit();
			return "<h1>data deleted</h1>";
		}

		else {
			return "<h1>data not fund</h1>";
		}

	}

	public String deleteAll() {

		Query q = em.createQuery("select data from Dto data");
		List<Dto> list = q.getResultList();

		if (list.isEmpty()) {
			return "<h1>no data found </h1>";
		}

		else {
			for (Dto uv : list) {
				et.begin();
				em.remove(uv);
				et.commit();

			}

			return "<h1>all data deleted</h1>";

		}
	}

	public Object fetchById(int id) {
		Dto d1 = em.find(Dto.class, id);

		if (d1 != null) {
			return d1;
		}

		else {

			return " <h1>null</h1>";
		}
	}
	
	
	
	public Object fetchAll()
	{
		  Query q=em.createQuery("select data from Dto data");
		     List<Dto>  list=q.getResultList();
		     
		     if(list.isEmpty())
		     {
		    	 return "<h1>null<h1/>";
		     }
		     
		     else {
		    	 
		    	 return list;
		     }     
		
	}

	public void update(Dto d1) {
		
		et.begin();
		em.merge(d1);
		et.commit();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
