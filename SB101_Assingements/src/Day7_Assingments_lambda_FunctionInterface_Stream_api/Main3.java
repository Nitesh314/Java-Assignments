package Day7_Assingments_lambda_FunctionInterface_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.print("\nOriginal list: ");
		list.forEach(n->System.out.print(n+" "));
		
		System.out.print("\nList of Squares: ");
		list.stream().map(n->n*n).collect(Collectors.toList()).forEach(a->System.out.print(a+" "));
		
	}

}
