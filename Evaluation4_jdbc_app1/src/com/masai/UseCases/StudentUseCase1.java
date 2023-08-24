package com.masai.UseCases;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Bean.Student;
import com.masai.DAO.StudentDao;
import com.masai.DAO.StudentDaoImpl;
import com.masai.Exception.StudentException;

public class StudentUseCase1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the student roll : ");
		int roll=sc.nextInt();
		
		System.out.print("Enter the student name : ");
		String name=sc.next();
		
		System.out.print("Enter the student address : ");
		String address=sc.next();
		
		System.out.print("Enter the student mobile : ");
		String mobile=sc.next();
		
		
		StudentDao dao=new StudentDaoImpl();
		
		
	      Student s=new Student(roll, name, address, mobile);
	 
		 String result=dao.registerStudentDetails(s);
		 System.out.println(result);
		 
		
		
		
	}

}
