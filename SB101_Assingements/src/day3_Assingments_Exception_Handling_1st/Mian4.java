package day3_Assingments_Exception_Handling_1st;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mian4 {
	
	public static void main(String[] args) {
		
	  Map<String, List<String>> hm=new TreeMap(new Comparator<String>() {

		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	});
		
	  hm.put("Maharashtra",Arrays.asList("Mumbai","Pune","Nashik","Palghar","Thane"));
	  hm.put("Uttar-Pradesh",Arrays.asList("PrayagRaj","VAranshi","LuckNow","Handiya","Chiuki"));
	  hm.put("Madhya-Pradesh",Arrays.asList("Bhopal","Ujjain","Indore","Jabalpur","Gwalior"));
	  hm.put("Bihar",Arrays.asList("Patana","Gaya","Bhagalpur","Sultangunj","Bukshar"));
	  hm.put("Rajasthan",Arrays.asList("Jaipur","Kota","Jodhapur","Bikaner","Udaypur"));
	  
	  
	  for(Map.Entry<String,List<String>> m:hm.entrySet()) {
		  
		  System.out.println("Top 5 Cites of "+m.getKey());

		  for(String s:m.getValue()) {
			  System.out.println("\n\r"+s);
			 
		  }
		  System.out.println("*************************");
	  }
	 
	  
	  
		
	}

}
