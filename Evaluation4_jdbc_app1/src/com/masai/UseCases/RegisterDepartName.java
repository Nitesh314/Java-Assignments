package com.masai.UseCases;

import java.util.Scanner;

import com.masai.Bean.Department;
import com.masai.DAO.DepartmentDao;
import com.masai.DAO.DepartmentDaoImpl;

public class RegisterDepartName {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Department id : ");
		int did=sc.nextInt();
		
		System.out.print("Enter the Department name : ");
		String dname=sc.next();
		
		System.out.print("Enter the Department location : ");
		String location=sc.next();
		
		Department dp=new Department(did, dname, location);
		
		DepartmentDao ddao=new DepartmentDaoImpl();
		
		String rs=ddao.registerDepartName(dp);
				
		System.out.println(rs);
		
	}

}
