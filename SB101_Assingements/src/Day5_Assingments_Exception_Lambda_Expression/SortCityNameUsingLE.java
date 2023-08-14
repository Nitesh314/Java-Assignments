package Day5_Assingments_Exception_Lambda_Expression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCityNameUsingLE {
	
	public static void main(String[] args) {
		
		List<String> cites=new ArrayList<>();
		
		cites.add("pune");
		cites.add("mumbai");
		cites.add("delhi");
		cites.add("ahemdabad");
		cites.add("kanpur");
		cites.add("Prayagraj");
		
		
        Collections.sort(cites, (c1,c2)->c2.compareToIgnoreCase(c1));
        
		 for(String s:cites) {
			 System.out.println(s);
		 }
		 
	}

}
