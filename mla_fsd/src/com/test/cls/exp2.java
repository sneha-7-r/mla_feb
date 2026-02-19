package com.test.cls;

import java.util.LinkedHashMap;

public class exp2 {
	
	public static void main(String[] args) {
		//HashMap<String,Integer> data = new HashMap<>();
		
		LinkedHashMap<String,Integer> data=new LinkedHashMap<>();
		data.put("sony", 330);
		data.put("lenovo", 320);
		data.put("dell", 200);
		data.put("sony", 5050);
		data.put("apple", 350);
		data.put("dell", 400);
		data.put(null,11);
		
		data.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println(data.get("sony"));
		
		
	}

}
