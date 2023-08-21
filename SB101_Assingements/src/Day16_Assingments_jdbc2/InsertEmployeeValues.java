package Day16_Assingments_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeValues {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee id : ");
		int empid=sc.nextInt();
		
		System.out.print("Enter the Employee name : ");
		String ename=sc.next();
		
		System.out.print("Enter the employee address : ");
		String address=sc.next();
		
		System.out.print("Enter the Employee mobile : ");
		String mobile=sc.next();
		
		System.out.print("Enter the Employee Department id : ");
		int deptId=sc.nextInt();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101","root","nitesh")){
		
	//insert the details from Employee
		
	PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
	  
	//binding the values;
	
    ps.setInt(1, empid);
    ps.setString(2, ename);
    ps.setString(3, address);
    ps.setString(4, mobile);
    ps.setInt(5, deptId);
    
    
    int x=ps.executeUpdate();
    
    if(x>0) {
    	System.out.println("record inserted successfully...");
    }else {
    	System.out.println("Not inserted...");
    }
	
	
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
		
		
		
		
		
	}

}
