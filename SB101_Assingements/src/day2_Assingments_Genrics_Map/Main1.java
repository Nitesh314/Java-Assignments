package day2_Assingments_Genrics_Map;

import java.util.Arrays;
import java.util.List;

public class Main1 {
	
	public <T> List<T> gList(List<T> inputList){
		
		return inputList;
	}
	
	
	public static void main(String[] args) {
		
		Main1 m=new Main1();
		
		//In generic place we use Integer data type;
		
		List<Integer> iList=m.gList(Arrays.asList(1,2,3,4,5));
			
		for(int i:iList) {
			System.out.println(i);
		}
		
		
		//Here we use String data type ;
		
		List<String> sList=m.gList(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N"));
		
		for(String s:sList) {
			System.out.println(s);
		}
		
		//in place of Integer and String also we use user defined data type ;
		
		
	}

}
