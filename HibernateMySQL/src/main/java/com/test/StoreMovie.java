package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreMovie {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Movie obj=new Movie();
		obj.setM_name("Spring");
		obj.setHero("Samuel");
		obj.setGenres("Comedy");
		
		
		/*Movie dt=session.get(Movie.class, 1);
		
		System.out.println(dt.getId()+" "+dt.getM_name()+" "+dt.getHero()+" "+dt.getGenres());
		dt.setM_name("Spring");
		dt.setHero("Dell");
		dt.setGenres("Comdey");
		*/
		session.persist(obj);
		//session.remove(dt);
		
			t.commit();
			
		
		
		System.out.println("Done");

	}

}
