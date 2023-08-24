package com.masai.DAO;


import java.util.List;

import com.masai.Bean.Student;
import com.masai.Exception.CourseException;
import com.masai.Exception.StudentException;

public interface StudentDao {
	
	public String registerStudentDetails(Student student); 
	
	public String enrollStudentInsidACourse(int cid,int roll)throws CourseException,StudentException;
	
	public List<Student>getStudentByCname(String cname)throws StudentException;
	
     
}
