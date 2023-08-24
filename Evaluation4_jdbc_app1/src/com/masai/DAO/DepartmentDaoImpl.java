package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.Bean.Department;
import com.masai.Utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String registerDepartName(Department d) {
		String message="Not registerd...";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into department values(?,?,?)");
			
		ps.setInt(1,d.getDid());
		ps.setString(2,d.getDname());
		ps.setString(3,d.getLocation());
		
	    int x=ps.executeUpdate();
	    
	    if(x>0) {
	    	message="register successfully...";
	    }
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

}
