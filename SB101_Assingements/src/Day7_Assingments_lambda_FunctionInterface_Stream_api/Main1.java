package Day7_Assingments_lambda_FunctionInterface_Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		
		list.add(new Product(1,"Mango",500,12));
		list.add(new Product(2,"Banana",120,6));
		list.add(new Product(3,"Apple",850,5));
		list.add(new Product(4,"Orange",450,50));
		list.add(new Product(5,"Grapes",320,24));
		
	 	list.stream().filter(p->p.getQuantity()>10).sorted((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?+1:-1).collect(Collectors.toList()).forEach(p->System.out.println("Filtered List\r\n"+"Product id : "+p.getProductId()+"\r\nProduct Name : "+p.getProductName()+"\r\nProduct Price : "+p.getProductPrice()+"\r\nProduct Quantity : "+p.getQuantity()+"\r\n************************************\r\n"));
		
	 	
	 	System.out.println("\r\n*************************************\r\n");
	 	
	 	
	 	
	 	list.forEach(p->System.out.println("Original list\r\n"+"Product id : "+p.getProductId()+"\r\nProduct Name : "+p.getProductName()+"\r\nProduct Price : "+p.getProductPrice()+"\r\nProduct Quantity : "+p.getQuantity()+"\r\n************************************\r\n"));
		
	}

}
