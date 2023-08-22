package Evaluation1St;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Main1 {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		List<Map.Entry<Employee, String>> list=new ArrayList<>(originalMap.entrySet());
		
		list.sort(Comparator.comparingDouble(e->e.getKey().getSalary()));
		
		Map<Employee, String> sortedMap=new LinkedHashMap<>();
		
		for(Map.Entry<Employee, String> em:list) {
			sortedMap.put(em.getKey(),em.getValue());
		}
		
		return sortedMap;
		
	}
	
	
	public static void main(String[] args) {
		
		Main1 m=new Main1();
		
		Map<Employee, String> hm=new HashMap<>();
		
		hm.put(new Employee(1, "Nitesh",5000),"Bkdpt");
		hm.put(new Employee(2, "Ashish",4500),"mkdpt");
		hm.put(new Employee(3, "Jadu",5100),"ckdpt");
		hm.put(new Employee(4, "Sandeep",4999),"akdpt");
		hm.put(new Employee(5, "Abhilash",5001),"lkdpt");
		
	    Map<Employee,String> mm=m.sortMapUsingEmployeeSalary(hm);
		
	    System.out.println("Employee Details Acording Salary");
	    
		for(Map.Entry<Employee, String> em:mm.entrySet()) {
			
			System.out.println("Employee department : "+em.getValue());
			
			System.out.println("em id : "+em.getKey().getEmpid()+
					            "\n\r"+"em name : "+em.getKey().getName()+"\n\r em Salaray : "+em.getKey().getSalary()+"\n\r *************************************");
		}
		
		
	}

}
