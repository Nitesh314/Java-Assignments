package Day6_assingments_Lambada_Expression_Fumctional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap){
		
		List<Map.Entry<String,Student>> list=new ArrayList<>(originalMap.entrySet());
		
		Collections.sort(list,(s1,s2)->s2.getValue().getName().compareToIgnoreCase(s1.getValue().getName()));
		
		Map<String,Student> sortedMap=new LinkedHashMap<>();
		
		for(Map.Entry<String,Student> m:list ) {
			sortedMap.put(m.getKey(),m.getValue());
		}
		
		return sortedMap;
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Student> hm=new HashMap<>();
		
		hm.put("India",new Student(1,"Nitesh",500));
		hm.put("America",new Student(2,"Ashish",600));
		hm.put("Dubai",new Student(3,"Vinit",700));
		hm.put("Landon",new Student(4,"Sandeep",800));
		hm.put("Nepal",new Student(5,"Rajkumar",900));
		
		
		//creating object of current class;
		
		Main3 m=new Main3();
		
		//using object call the methods of current class
		
		Map<String,Student> sm= m.sortMapUsingStudentName(hm);
		
		for(Map.Entry<String, Student> sM:sm.entrySet()) {
			System.out.println("Student Country : "+sM.getKey()+"\r\n"
					            +"Student Roll is : "+sM.getValue().getRoll()+"\r\n"
					            +"Student Name is : "+sM.getValue().getName()+"\r\n"
					            +"Student Marks is : "+sM.getValue().getMarks()+"\r\n"
					            +"\r\n**********************************************\r\n");
			
		}
		
	}

}
