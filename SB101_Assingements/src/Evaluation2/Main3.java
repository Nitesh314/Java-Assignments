package Evaluation2;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main3 {
	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
	    list.add(new Student(1,"Nitesh",500));
	    list.add(new Student(2,"Ashish",450));
	    list.add(new Student(3,"Sandeep",520));
	    list.add(new Student(4,"Jadu",499));
	    list.add(new Student(5,"NIlesh",502));
	    
	    List<Employee> elist=new ArrayList<>();
	    
	     list.stream().filter(s->s.getMarks()>500).forEach(s->elist.add(new Employee(s.getRoll(),s.getName(),s.getMarks()*10000,"abc company")));
	    
	    elist.forEach(e->System.out.println("empId : "+e.getEmpId()+"\r\nemp name : "+e.getName()+"\r\nemp salary : "+e.getSalary()+"\r\nemp address : "+e.getAddress()+"\r\n*****************************"));
	    
	    
	}

}
