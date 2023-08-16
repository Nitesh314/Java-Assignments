package Day7_Assingments_lambda_FunctionInterface_Stream_api;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private int quantity;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId,String productName,double productPrice,int quantity ) {
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		this.quantity=quantity; 
				
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	

}
