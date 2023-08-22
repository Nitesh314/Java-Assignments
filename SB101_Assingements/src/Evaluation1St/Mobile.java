package Evaluation1St;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
    
	
	public String addMobile(String company, String model) {
		
		if(mobiles.containsKey(company)) {
			
			ArrayList<String> models=mobiles.get(company);
			
			models.add(model);
			
		}
		else {
			
			ArrayList<String> models=new ArrayList<>();
			
			models.add(model);
			
			mobiles.put(company, models);
		}
		
		
		return "mobile added successfully";
		
	}
	
	public List<String> getModels(String company){
		
		if(mobiles.containsKey(company)) {
			return mobiles.get(company);
		}
		else {
			return new ArrayList<>();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		
		    mobile.addMobile("Apple", "iPhone13");
	        mobile.addMobile("Samsung", "Galaxy S21");
	        mobile.addMobile("Apple", "iPhone12");
	        mobile.addMobile("OnePlus", "9 Pro");
	        mobile.addMobile("Apple", "iPhoneSE");
	        
	        
	        String company = "Samsung";
	        List<String> models = mobile.getModels(company);

	        if (models.isEmpty()) {
	            System.out.println("Invalid Company Supplied.");
	        } else {
	            System.out.println("Models of " + company + ": " + models);
	        }
	        
	        
	        
	}
	
	
}
	
   

