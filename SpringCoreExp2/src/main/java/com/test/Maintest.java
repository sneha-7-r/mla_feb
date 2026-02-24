package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {

	public static void main(String[] args) {
	
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Customer cst=(Customer)ctx.getBean("cst1");
     //System.out.println(obj);
	//ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnoConfig.class);
	List<Address> list=new ArrayList<>();
	System.out.println(cst);
	Address aobj=ctx.getBean(Address.class);
	
	aobj.setCity("Belgavi");
	aobj.setCountry("India");
	aobj.setState("KA");
	
	list.add(aojb);
	cst.setAdr(list);
	
	Address aobj2=ctx.getBean(Address.class);
	aobj2.setCity("Bagalkot");
	aobj2.setCountry("India");
	aojb2.setState("Karnataka");
	
	Customer cst=ctx.getBean(Customer.class);
	cst.setId(112);
	cst.setName("Rahul");
	cst.setAdr(aobj);
	System.out.println(cst);
	
	
	}
	
	

}
