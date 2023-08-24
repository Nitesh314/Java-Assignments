package com.masai.UseCases;

import java.util.Scanner;

import com.masai.DAO.StudentDao;
import com.masai.DAO.StudentDaoImpl;
import com.masai.Exception.CourseException;
import com.masai.Exception.StudentException;

public class StudnetEnrolledInCourseUseCase2 {
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Student roll : ");
		int roll=sc.nextInt();
		
		System.out.print("Enter the Course Id : ");
		int cid=sc.nextInt();
		
		
		StudentDao dao=new StudentDaoImpl();
		
		try {
			String message=dao.enrollStudentInsidACourse(roll,cid);
			
			System.out.println(message);
			
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
	
}
