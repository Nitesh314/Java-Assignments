package Day5_Assingments_Exception_Lambda_Expression;

public class Main3 {
	
	public static void main(String[] args) {
		
		
		X convert=Integer::parseInt;
		
	    int res=convert.convetStringToNumber("20");
	    
	    System.out.println(res+50);
	 	
	}

}
