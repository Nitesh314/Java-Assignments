package day2_Assingments_Genrics_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main3 {
	
	public static void main(String[] args) {
		
		Map<String, String> lMap=new LinkedHashMap<>();
		
		lMap.put("Maharashtra", "Mumbai");
		lMap.put("Uttar-Pradesh", "LuckNow");
		lMap.put("Madhya-Pradesh", "Bhopal");
		lMap.put("Bihar", "Patana");
		lMap.put("Gujrat", "Ahemdabad");
		
		for(Map.Entry<String,String> em: lMap.entrySet()) {
			System.out.println(em.getKey()+" ----> "+em.getValue());
		}
		
			
	}

}
