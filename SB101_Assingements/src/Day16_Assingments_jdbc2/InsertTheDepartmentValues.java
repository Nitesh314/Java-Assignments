package Day16_Assingments_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTheDepartmentValues {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the  Department id : ");
		int did=sc.nextInt();
		
		System.out.print("Enter the department name : ");
		String dname=sc.next();
		
		System.out.print("Enter the location : ");
		String location=sc.next();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101","root","nitesh")){
		
	//insert the details from Employee
		
	PreparedStatement ps=conn.prepareStatement("insert into department values(?,?,?)");
	  
	//binding the values;
	
    ps.setInt(1, did);
    ps.setString(2, dname);
    ps.setString(3, location);
    
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
