package day1Assingment_Queue_Iterator_Generics;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import Day5_Assingments_Exception_Lambda_Expression.Product;

public class Main2 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Product> pq=new PriorityQueue<>(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				  
				return Double.compare(o2.getProductPrice(), o1.getProductPrice());
			}
			
			  
			
		});
		
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=0;i<5;i++) {
	    	
	    	System.out.println("Enter the "+(i+1)+" Product");
	    	
	    	System.out.println("Enter the product id ");
	    	int productId=sc.nextInt();
	    	
	    	sc.nextLine();
	    	
	    	System.out.println("Enter the product name ");
	    	String productName=sc.nextLine();
            
	    	System.out.println("Enter the product price ");
	    	double productPrice=sc.nextDouble();
	    	
	    	sc.nextLine();
	    	
	    	
	    	Product productQ=new Product(productId, productName, productPrice);
	    			
	    	pq.offer(productQ);
	    	
	    }
	    
	    
	    
	    
	   Iterator<Product> itr= pq.iterator();
	   
	   while(itr.hasNext()) {
		   
		   Product pr=itr.next();
		   
		   System.out.println("Product id is : "+pr.getProductId());
		   System.out.println("Product name is : "+pr.getProductName());
		   System.out.println("Product price is : "+pr.getProductPrice());
		   System.out.println("******************************************");
		   
	   }
		
		
  }

}
