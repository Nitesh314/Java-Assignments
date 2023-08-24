package com.masai.UseCases;

import java.util.List;
import java.util.Scanner;

import com.masai.Bean.Course;
import com.masai.DAO.CourseDao;
import com.masai.DAO.CourseDaoImpl;
import com.masai.Exception.CourseException;

public class GetCourseByRollUsecase3 {
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the roll : ");
		int roll=sc.nextInt();
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
		List<Course> clist=dao.getCourseByRoll(roll);
			
			clist.forEach(course->System.out.println("Course id : "+course.getCid()+"\nCourse Name : "+course.getCname()+"\nCourse fees : "+course.getFee()+"\nCourse Duration : "+course.getDuration()+"\n**********************************"));
						
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
