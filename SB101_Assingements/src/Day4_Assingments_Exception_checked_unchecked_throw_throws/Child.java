package Day4_Assingments_Exception_checked_unchecked_throw_throws;

public class Child extends Parent {
    
	public Child() throws Exception {
		super();
	}
	
	public static void main(String[] args) {
		
		try {
			Child c=new Child();
			c.fun1();
		} catch (Exception e) {
			System.out.println("Inside Cunstructor of Child");
		}
		
		
	}
	
	
	
	
	
}
