package com.test;

@FunctionalInterface 
interface FunInf1 {
	String greetUser(String name, String msg);
}

public class exp3 {
	
	public void add() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		FunInf1 obj1 =(String name, String msg) ->
		{
			System.out.println("Hi " + name +" " + msg);
			
			return "Hello "+ name + " MLA "+msg;
		};
		
		obj1.greetUser("Sneha",",FSD MetaGeek Coders..");
		System.out.println(obj1.greetUser("Sneha",",FSD MetaGeek Coders.."));
	}
	
	//exp3 obj3 = new exp3();
	//System.out.println(obj3.add()); it accepts a value in method

}
