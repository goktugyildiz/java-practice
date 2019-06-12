package day45_encapsulation_practice;

import java.util.*;

public class Canvas {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programing");
		/*
		 * we need to create a list before 
		 */

		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasly");
		javaTeachers.add("Murodil");
		javaTeachers.add("Muhtar");
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("goktug");
		javaStudents.add("burak");
		javaStudents.add("gokcesu");
		javaStudents.add("orhan");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());

		//lets add one more teacher
		
		course1.addTeacher("Maria");
		course1.addStudent("Ciki");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("MAria is a teacher");
		}else {
			System.out.println("MAria is  NOT a teacher");

		}
		if(course1.getStudents().contains("gokcesu")) {
			System.out.println("Gokcesu is a student");
		}else {
			System.out.println("Gokcesu is NOT a student");
		}
		
		//try to remove teacher
		
		course1.removeTeacher("Muhtar");
		course1.removeStudent("burak");
		if(course1.getTeachers().contains("Muhtar")) {
			System.out.println("Muhtar is removed");
		}else {
			System.out.println("Muhtar is still teacher");
		}
		if(course1.getStudents().contains("burak")) {
			System.out.println("Burak is removed");
		}else {
			System.out.println("Burak is still student");
		}
		//
		System.out.println(course1.toString());
		
		
	}

}
