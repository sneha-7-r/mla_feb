package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Order order1=new Order();
		order1.setO_name("Table");
		order1.setO_price(22);
		
		Order order2=new Order();
		order2.setO_name("Chair");
		order2.setO_price(2);
		
		List<Order> listOrder=Arrays.asList(order1,order2);
		
		User uobj=new User();
		uobj.setU_name("Rohini");
		uobj.setOrders(listOrder);
		
		session.persist(uobj);
		t.commit();
		session.close();

	}

}
