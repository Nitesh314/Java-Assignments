package Day5_Assingments_Exception_Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingProduct {
	
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"parle",550));
		list.add(new Product(2,"apple",420));
		list.add(new Product(3,"banana",549));
		list.add(new Product(4,"rose",555));
		list.add(new Product(5,"aam",565));
		
		
		Collections.sort(list,(p1,p2)->p2.getProductPrice()>p1.getProductPrice()?+1:-1);
		
		for(Product p:list) {
			System.out.println("Product id : "+p.getProductId()+"\r\nProduct Name : "+p.getProductName()+"\r\nProduct Price : "+p.getProductPrice()+"\r\n******************************************\r\n");
		}
		
	}

}
