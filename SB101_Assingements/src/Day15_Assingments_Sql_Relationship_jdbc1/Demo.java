package Day15_Assingments_Sql_Relationship_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	
//	Q2/ Write an application to establish the connection between the Java application and Mysql
//	database Server.

	
	public static void main(String[] args) {
	   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		 Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101","root","nitesh");
		 
		 if(conn!=null) {
			 System.out.println("connnected...");
		 }
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
