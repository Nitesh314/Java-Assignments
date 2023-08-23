package Evaluation2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("nitesh","ashish","jadu","kalu","pk","sandeep","pagal");
		
		    System.out.println("\r\nSOrted lsit \r\n");
	    	list.stream().filter(s->s.length()%2==0).sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
	       System.out.println("\r\nOriginal list\r\n");
		   list.forEach(s->System.out.println(s));
		
		
	}

}
