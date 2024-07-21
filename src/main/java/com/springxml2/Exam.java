package com.springxml2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.setStudentName("Mayur G");
//		s1.displayStudentInfo();
		
		//spring magic
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s2 = context.getBean("student",Student.class);
		s2.displayStudentInfo();
		
		Student ashish = context.getBean("ashish",Student.class);
		ashish.displayStudentInfo();
		System.out.println();
		
		Student s3 = new Student(3, "Manoj");
		s3.displayStudentInfo();
		
		Student s4 = context.getBean("student2",Student.class);
		s4.displayStudentInfo();
	

	}
}
