package day2_Assingments_Genrics_Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class Main2 {
	
	public static void main(String[] args) {
	   
		Map<Student,String> studentMap=new TreeMap<>(new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getMarks()>s2.getMarks()?-1:+1;
			}
		});
		
		studentMap.put(new Student(1,"Nitesh",500), "Maharashtra");
		studentMap.put(new Student(2,"Ashish",450), "Uttar-Pradesh");
		studentMap.put(new Student(3,"Sandeep",550), "Bihar");
		studentMap.put(new Student(4,"Rajkumar",555), "TamilNadu");
		studentMap.put(new Student(5,"Pradyuman",650), "Madhya-Pradesh");
		
	for(Map.Entry<Student, String> ms:studentMap.entrySet()) {
		 
		System.out.println(ms.getValue()+" State Toper\n\r"+"Name : "+ms.getKey().getName()+"\n\r"+"Roll : "+ms.getKey().getRoll()+"\n\r"+"Marks : "+ms.getKey().getMarks()+"\n\r********************************");
		 
	}
		
		
	}
	

}
