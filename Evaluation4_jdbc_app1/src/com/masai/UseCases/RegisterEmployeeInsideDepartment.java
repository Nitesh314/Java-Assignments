package com.masai.UseCases;

import java.util.Scanner;

import com.masai.Bean.Department;
import com.masai.Bean.Employee;
import com.masai.DAO.EmployeeDao;
import com.masai.DAO.EmployeeDaoImpl;

public class RegisterEmployeeInsideDepartment {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee id : ");
		int eid=sc.nextInt();
		
		System.out.print("Enter the Employee name : ");
		String ename=sc.next();
		
		System.out.print("Enter the Employee address : ");
		String address=sc.next();
		
		System.out.print("Enter the Employee mobile : ");
		String mobile=sc.next();
		
		System.out.print("Enter the Employee salary : ");
		int salary=sc.nextInt();
		
		System.out.print("Enter the Employee Department id : ");
		int dptid=sc.nextInt();
		
		
		Employee e=new Employee(eid, ename, address, mobile, salary, dptid);
		
		EmployeeDao edao=new EmployeeDaoImpl();
		
		
		String rs=edao.registerEmployeeInDepartment(e);
		
		
		System.out.println(rs);
		
	}

}
