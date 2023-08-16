package Day7_Assingments_lambda_FunctionInterface_Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main2 {
	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1, "Nitesh",500));
		list.add(new Student(2, "Ashish",620));
		list.add(new Student(3, "Sandeep",490));
		list.add(new Student(4, "Jadu",555));
		list.add(new Student(5, "Anlit",840));
		
	Student s=list.stream().max((s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1).get();
	   
	System.out.println("Student Roll : "+s.getRoll()+"\r\nStudent Name : "+s.getName()+"\r\nStudent Marks : "+s.getMarks());
		
		
	}

}
