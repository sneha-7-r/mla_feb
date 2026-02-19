package com.test;

interface Inf1
{
	float pi=3.14f;//public static final float pi=3.14f;
	
	void disp();//public abstract void disp();
	void add();
	
	default void human() {
		System.out.println("default inf");
		animal();
	}
	
	static String greetUser(String msg) {
		//animal();
		return msg;//static methods cannot override(class level)
	}
	
	private void animal() {
		System.out.println("private method");
		
	}
	
}


interface Inf2
{
	void book();
}

abstract class Abs1{
	
	public Abs1()
	{
		System.out.println("constructor");
	}
	
	public abstract void fox();
	
	public void color() {
		System.out.println("implemented method abs1");
	}
}

class Impl1 extends Abs1 implements Inf1,Inf2
{
	@Override
	public void fox() {
		System.out.println("abs method implemented");
	}
	@Override
	public void book()
	{
		System.out.println("implemented inf2 method");
	}
	@Override
	public void disp() {
		System.out.println("implemented inf1 method");
	}
	@Override
	public void add()
	{
		System.out.println("implemented inf1 method");
	}
}




public class exp1 {
	
	public static void main(String[] args) {
		
		Impl1 obj = new Impl1();
		
		obj.book();
		obj.add();
		obj.disp();
		obj.human();
		obj.fox();
		obj.color();
		
		System.out.println(Inf1.greetUser("Hi MLA coders"));
	}
	

}

/*How many ways we can create object for class
 * using new operator
 * using factory method
 * using clone() method
 * using Class.forName() dynamic object creation
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
