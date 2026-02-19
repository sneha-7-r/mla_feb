package com.test;

@FunctionalInterface
interface FunInf
{
	void draw();
	//void color(); only one abstract method inside functional interface
	
	default void dog() {
		
		
		
	}
	
	static void cat() {
		
	}
	
}

class Circle implements FunInf{
	
	@Override
	public void draw() {
		System.out.println("circle");
	}
}


class Square implements FunInf
{
	@Override
	public void draw() {
		System.out.println("square");
		
	}
	
	//factory method returns name is same as class name
	public Square getObj()
	{
		System.out.println("object returned");
		return new Square();
	}
}
public class exp2 {
	public static void main(String[] args) {
		
		Circle obj1 = new Circle();
		//FunInf obj1 = new Circle();//dynamic binding
		obj1.draw();
		
		Square obj2=new Square();
		obj2.draw();
		
		//Square obj3 = obj2.getObj();
		
		//lambda expression
		FunInf obj4= () -> System.out.println("circle");
		obj4.draw();
		}

}
