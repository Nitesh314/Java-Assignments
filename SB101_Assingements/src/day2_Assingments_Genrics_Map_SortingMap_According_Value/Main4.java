package day2_Assingments_Genrics_Map_SortingMap_According_Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import day2_Assingments_Genrics_Map.Student;

public class Main4 {
	
	public static void main(String[] args) {
		
		Map<String, Student> hm=new HashMap<>();
		
		hm.put("Maharashtra",new Student(1,"Nitesh",500));
		hm.put("Uttar-Pradesh",new Student(2,"Ashish",450));
		hm.put("Bihar",new Student(3,"Sandeep",550));
		hm.put("TamilNadu",new Student(4,"Rajkumar",555));
		hm.put("Madhya-Pradesh",new Student(5,"Pradyuman",650));
		
		System.out.println(hm.size());
		
		
		List<Map.Entry<String, Student>> sortedMap=new ArrayList<>(hm.entrySet());
		
		Collections.sort(sortedMap,new Comparator<Map.Entry<String,Student>>() {

			@Override
			public int compare(Entry<String, Student> s1, Entry<String, Student> s2) {
				
				return s1.getValue().getMarks()>s2.getValue().getMarks()?-1:+1;
			}
		});
		
		
		
		//convert list to  linkedHash map for  preserve the order 
		
		System.out.println("Student sorted details in map form ");
		
		Map<String, Student> sortedStudentMap = new LinkedHashMap<>();
        for (Map.Entry<String, Student> entry : sortedMap) {
            sortedStudentMap.put(entry.getKey(), entry.getValue());
        }
	  	 
	   
        for(Map.Entry<String, Student> ms:sortedStudentMap.entrySet()) {
   		 
    		System.out.println(ms.getKey()+" State Toper\n\r"+"Name : "+ms.getValue().getName()+"\n\r"+"Roll : "+ms.getValue().getRoll()+"\n\r"+"Marks : "+ms.getValue().getMarks()+"\n\r********************************");
    		 
    	}
	  
       //************************************************************************
        
        //here if we not convert list to map then it have same out put but in form of list not a map 
        //so if we achieve output in map then we use upper code else we get this code..
        
        
        // code to print list without achieving map
        
        System.out.println("student sorted details in list form ");
		
        for(Map.Entry<String, Student> ms:sortedMap){
      		 
    		System.out.println(ms.getKey()+" State Toper\n\r"+"Name : "+ms.getValue().getName()+"\n\r"+"Roll : "+ms.getValue().getRoll()+"\n\r"+"Marks : "+ms.getValue().getMarks()+"\n\r********************************");
    		 
    	}
		
		
		
		
		
		
		
		
         
		 
		 
		
		 
		
		
	}

}
