package com.masai.UseCases;

import java.util.List;
import java.util.Scanner;

import com.masai.Bean.Student;
import com.masai.DAO.StudentDao;
import com.masai.DAO.StudentDaoImpl;
import com.masai.Exception.StudentException;

public class GetStudentByCourseName {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Course name : ");
		String cn=sc.next();
		
		StudentDao dao=new StudentDaoImpl();
		
		try {
			List<Student> slist=dao.getStudentByCname(cn);
			
			slist.forEach(s->System.out.println("Student roll : "+s.getRoll()+"\nStudent name : "+s.getName()+"\nStudent address : "+s.getAddress()+"\nStudent mobile : "+s.getMobile()+"\n*****************************\n"));
			
			
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
				
		
		
		
		
	}

}
