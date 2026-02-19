package com.test;

public class Exp5 {
public static void main(String[] args) {
	
	try {
		System.out.println(11/5);
	    String name=null;
		System.out.println(name.equals("test"));
		
	}
	catch(ArithmeticException ae) {
		System.out.println("cannot divide by zero.");
		
		System.exit(0);
		return;
	}
	catch(NullPointerException ne) {
		System.out.println("enter a value for string");
	}
	catch(StringIndexOutOfBoundsException siob) {
		System.out.println("check string length");
	}
	catch(ArrayIndexOutOfBoundsException aiob) {
		System.out.println("check array length");
	}
	catch(NumberFormatException nob) {
		System.out.println("check input string");
	}
	catch(Exception e) {
		System.out.println("try again");
	}
	finally
	{
		System.out.println("finally block");
	}
}
}
