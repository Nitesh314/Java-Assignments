package com.masai.UseCases;

import java.util.Scanner;

import com.masai.Bean.Course;
import com.masai.DAO.CourseDao;
import com.masai.DAO.CourseDaoImpl;

public class CourseUseCase1 {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Course id : ");
		int cid=sc.nextInt();
		
		System.out.print("Enter the Course name : ");
		String cname=sc.next();
		
		System.out.print("Enter the Course fees : ");
		int fee=sc.nextInt();
		
		System.out.print("Enter the Course duration: ");
		String duration=sc.next();
		
		Course c=new Course(cid, cname, fee, duration);
		
		CourseDao cDao=new CourseDaoImpl();
		
		String message=cDao.registerCourse(c);
		
		System.out.println(message);
		
		
	}

}
