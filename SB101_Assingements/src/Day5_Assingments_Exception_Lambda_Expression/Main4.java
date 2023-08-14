package Day5_Assingments_Exception_Lambda_Expression;

import java.util.Arrays;
import java.util.List;


public class Main4  {
    
	
	public static void main(String[] args) {
		
		PrintList p=c->{
			for(String s:c) {
				System.out.println(s);
			}
		};
		
		p.display(Arrays.asList("a","b","c","d"));
		
		
	}
   
}
