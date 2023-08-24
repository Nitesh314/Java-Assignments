package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Bean.Course;
import com.masai.Bean.Student;
import com.masai.Exception.CourseException;
import com.masai.Exception.StudentException;
import com.masai.Utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
public String registerStudentDetails(Student student) {
		
		String message="Not inserted...";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			//use prepareStatemnt to execute the query;
			
		PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
		
		//binding the values;
		
		ps.setInt(1,student.getRoll());
		ps.setString(2,student.getName());
		ps.setString(3, student.getAddress());
		ps.setString(4, student.getMobile());
		
		//use executeUpdate method;
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Student details registered successfully...";
		}
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

//*******************************************************************************************************************************	
	
	@Override
	public String enrollStudentInsidACourse(int roll, int cid) throws CourseException, StudentException {
		String message="Student not enrolled inside the course";
		
		try (Connection conn=DBUtil.provideConnection()){
			
		PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
		
		//binding value;
		
		ps.setInt(1,roll);
		
	    ResultSet rs=ps.executeQuery();
	    
	    if(rs.next()) {
	    	
	    PreparedStatement ps1=conn.prepareStatement("select * from course where cid=?");
	    	
	    //binding value
	    
	    ps1.setInt(1, cid);
	    
	   ResultSet rs1= ps1.executeQuery();
	   
	   if(rs1.next()) {
		   
		PreparedStatement ps2=conn.prepareStatement("insert into Student_Course value(?,?)");
		
		//binding value;
		
		ps2.setInt(1,roll);
		ps2.setInt(2, cid);
		
	    int x=ps2.executeUpdate();
	    
	    if(x>0) {
	    	message="Student Enrolled Successfully insid the Course...";
	    	
	    }else {
	    	throw new StudentException("Techinal Error please try again...");
	    }
		
		
		   
	   }else {
		   throw new CourseException("Invalid Course details...");
	   }
	    	
	    	
	    	
	    }else {
	    	throw new StudentException("Invalid Student details...");
	    }
			
			
		} catch (SQLException e) {
		   System.out.println(e.getMessage());
		}
		
		
		
		return message;
	}

	

	
//***************************************************************************************************	
	
	@Override
	public List<Student> getStudentByCname(String cname) throws StudentException {
		
		List<Student> slist=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("Select s.roll,s.name,s.address,s.mobile from student s INNER JOIN Course c INNER JOIN Student_Course cs ON s.roll=cs.cs_roll AND c.cid=cs.cs_cid AND c.cname=?");
		
		ps.setString(1, cname);
	
	    ResultSet rs=ps.executeQuery();
	    
	    while(rs.next()) {
	    	
	    int r=	    rs.getInt("roll");
	    String n=	rs.getString("name");
	    String a=	rs.getString("address");
	    String m=	rs.getString("mobile");
	    
	    Student s=new Student(r, n, a, m);
	    
	    slist.add(s);
	    	
	    }
			
			if(slist.isEmpty()) {
				System.out.println("Student not enrolled in course");
			}
			
			
		} catch (SQLException e) {
                throw new StudentException(e.getMessage());
		}
		
		
		
		
		
		return slist;
	}

	
}
