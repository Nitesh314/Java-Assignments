package com.masai.DAO;

import java.util.List;

import com.masai.Bean.Course;
import com.masai.Exception.CourseException;


public interface CourseDao {
	
	public String registerCourse(Course course);
	
	public List<Course> getCourseByRoll(int roll)throws CourseException;

}
