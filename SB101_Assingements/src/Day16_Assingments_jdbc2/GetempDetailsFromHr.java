package Day16_Assingments_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetempDetailsFromHr {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101","root","nitesh")){
		
	//get the details from employee where department name hr;
		
	PreparedStatement ps=conn.prepareStatement("select e.empid,e.ename,e.address,e.mobile,d.dname,d.location from employee e INNER JOIN department d ON e.deptid=d.did AND d.dname='hr'");
	  
	
   ResultSet rs= ps.executeQuery();
   
   while(rs.next()) {
	   System.out.println("employee id : "+rs.getInt("empid")+
			                                                  "\r\nemployee name : "+rs.getString("ename")+
			                                                  "\r\nemployee address : "+rs.getString("address")+
			                                                  "\r\nemployee mobile : "+rs.getString("mobile")+
			                                                  "\r\ndepartment name : "+rs.getString("dname")+
			                                                  "\r\ndepartment location : "+rs.getString("location")+
			                                                  "\r\n================================/rn");
   }
     
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
		
		
	}

}
