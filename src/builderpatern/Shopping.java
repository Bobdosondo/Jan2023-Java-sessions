package builderpatern;

public class Shopping {

	public Shopping login() {
		System.out.println("Login to app");
		return this;//current class(Shopping) object

	}

	public Shopping login(String un, String pwd) {
		System.out.println("Login to app with: " + un +" "+pwd);
		return this ;
	}

	public Shopping search() {
		System.out.println("product search");
		return this ;

	}

	public Shopping search(String name) {
		System.out.println("product search: "+ name);
		return this ;

	}

	public Shopping addToCart(String name) {
		System.out.println("Adding to cart: "+ name);
		return this ;

	}

	public Shopping doPayement(String cc, int cvv) {
		System.out.println("Making payement with :" +cc + " "+ cvv);
		return this; 

	}
	
	public Shopping doPayement(String upi) {
		System.out.println("Making payement with :" + upi);
		return this ;
		
	}
	 
	public Shopping generateOrderId() {
		System.out.println("Order id is 12345");
		return this ;
	}
	 public Shopping logOut() {
		 System.out.println("User is logged out");
		 return this ;
	 }
	
}
