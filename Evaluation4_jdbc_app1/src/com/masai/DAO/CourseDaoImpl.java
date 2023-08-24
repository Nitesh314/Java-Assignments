package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Bean.Course;
import com.masai.Exception.CourseException;
import com.masai.Utility.DBUtil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String registerCourse(Course course) {
             
	   String message="Course not inserted...";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps =conn.prepareStatement("insert into course values(?,?,?,?)");
			
			//binding values;
			
			ps.setInt(1,course.getCid());
			ps.setString(2,course.getCname());
			ps.setInt(3,course.getFee());
			ps.setString(4,course.getDuration());
			
			//executeUpdate method use;
			
		int x=ps.executeUpdate();
	     
		if(x>0) {
			message="Course registered Successfully....";
			
		}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}

	
//********************************************************************************
	
	
	@Override
	public List<Course> getCourseByRoll(int roll) throws CourseException {
		
		List<Course> clist=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("select * from Course c INNER JOIN Student s INNER JOIN Student_Course cs ON s.roll=cs.cs_roll AND c.cid=cs.cs_cid AND s.roll=?");
		
		//binding value;
		
		ps.setInt(1, roll);
		
	    ResultSet rs=ps.executeQuery();
		
	    while(rs.next()) {
	    	
	    	int r=rs.getInt("cid");
	    	String cn=rs.getString("cname");
	    	int f=rs.getInt("fee");
	    	String d=rs.getString("duration");
	    
	       Course	c=new Course(r, cn, f, d);
	       clist.add(c);
	    	
	    }
	    
	    if(clist.isEmpty()) {
	    	throw new CourseException("Course is not avalible for roll : "+roll);
	    }
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return clist;
		
		
	}
	

}
