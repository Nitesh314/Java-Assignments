package day3_Assingments_Exception_Handling_1st;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;

public class Main2 {
	
	public int findAge(String dob) {
		
		int age=0;
		
	try {
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
		
		
		
		
		
		return age;
	}

}
