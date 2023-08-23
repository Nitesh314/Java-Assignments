package Evaluation2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import Day6_assingments_Lambada_Expression_Fumctional_Interface.Student;

public class PredicateImpl {
	
	public static void main(String[] args) {
		
		//: if student marks are less than 500
		
		List<Student>list=new ArrayList<>();
		
		list.add(new Student(1,"Nitesh",500));
		list.add(new Student(2,"Ashish",600));
		list.add(new Student(3,"Vinit",700));
		list.add(new Student(4,"Sandeep",800));
		list.add(new Student(5,"Rajkumar",900));
		
		Predicate<Student> ss=s->s.getMarks()<500;
		
	   boolean pres=   ss.test(new Student(1,"Nitesh",500));
	    
	      System.out.println("Predicate output : "+pres);
	    
	    Consumer<Student> cns=s->System.out.println("Consumer output \r\n"+"Name : "+s.getName()+"\r\nRoll : "+s.getRoll()+"\r\nMarks : "+s.getMarks());
		
	    cns.accept(new Student(1,"Nitesh",500));
	    
	    Supplier<Student> sp=()->new Student(1,"Ram",500);
	    
	   Student s= sp.get();
	   
	   System.out.println("Supplier output \r\n"+"Name : "+s.getName()+"\r\nRoll : "+s.getRoll()+"\r\nMarks : "+s.getMarks());
	   
	   Function<String,Integer> fun=f->Integer.parseInt(f);
	   
	  int res= fun.apply("20");
	  
	  int sum=res+30;
	  
	  System.out.println("Function output : "+sum);
	   
	}

}
