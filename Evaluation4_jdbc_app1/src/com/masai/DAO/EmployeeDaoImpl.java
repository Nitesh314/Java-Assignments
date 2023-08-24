package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.Bean.Employee;
import com.masai.Utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmployeeInDepartment(Employee e) {
        
		String message="Not registerd...";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			
		ps.setInt(1,e.getEmpId());
		ps.setString(2,e.getEname());
		ps.setString(3,e.getAddress());
		ps.setString(4,e.getMobile());
		ps.setInt(5,e.getSalary());
		ps.setInt(6,e.getDeptId());
		
	
		
	    int x=ps.executeUpdate();
	    
	    if(x>0) {
	    	message="register successfully...";
	    }
			
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return message;
 
		
	}

}
