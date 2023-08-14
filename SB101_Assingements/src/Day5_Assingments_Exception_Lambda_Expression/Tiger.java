package Day5_Assingments_Exception_Lambda_Expression;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() throws AnimalException {
		System.out.println("Tiger is eating !!");
	}
	
	
	
	public static void main(String[] args)  {
		
		try {
			Tiger t=new Tiger();
			t.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
