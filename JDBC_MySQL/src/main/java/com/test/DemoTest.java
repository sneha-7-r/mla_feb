package com.test;

import java.util.List;

public class DemoTest {
public static void main(String[] args) {
    StudentDao edao=new StudentDao();
	Student std1=new Student();
	std1.setId(2);
	std1.setName("Shalini");
	std1.setClg("KSSEM");
	std1.setCity("Bengaluru");
	
	//edao.saveStudent(std1);
	
	edao.updateStudent(std1);
	System.out.println("Save Student Data.");
	List<Student> data=edao.getAllStudents();
	data.forEach(System.out::println);
}
}
