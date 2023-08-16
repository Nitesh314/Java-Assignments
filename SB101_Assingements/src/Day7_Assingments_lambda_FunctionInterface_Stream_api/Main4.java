package Day7_Assingments_lambda_FunctionInterface_Stream_api;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main4 {
	
	public static void main(String[] args) {
	   
		Set<Student> set=new HashSet<>();
		
		set.add(new Student(1, "Nitesh",500));
		set.add(new Student(2, "Ashish",620));
		set.add(new Student(3, "Sandeep",490));
		set.add(new Student(4, "Jadu",555));
		set.add(new Student(5, "Anlit",840));
		
		
		
		//this is filtered set not a original set
		set.stream().filter(s->s.getMarks()<500).collect(Collectors.toSet()).forEach(s-> System.out.println("studetn roll : "+s.getRoll()+"\r\nStudent Name : "+s.getName()+"\r\nStudent Marks : "+s.getMarks()+"\r\n*********************\r\n"));
	
	}

}
