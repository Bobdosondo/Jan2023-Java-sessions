package builderpatern;

public class AmazonShop {

	public static void main(String[] args) {

		
		//builder patern
		
		//sc1
		Shopping shop = new Shopping();
		shop.login("bob@gmail.com", "bob1234")
		       .search("Tshirt")
		          .addToCart("Tshirt")
		            .doPayement("1234567889", 123)
		              .generateOrderId()
		                 .logOut();
		
		//sc2
		shop.login("bob@gmail.com", "bob1234")
		       .search("Macbook")
		          .addToCart("Macbook")
		             .logOut();
		
		//sc3
		
		shop.login("bob@gmail.com", "bob1234")
		       .doPayement("1234567889", 123)
		          .generateOrderId()
		             .logOut();
		
		
		//sc4
		shop.login("bob@gmail.com", "bob1234").logOut();
		
		//sc5
		shop.login("bob@gmail.com", "bob1234").logOut().login();

	}

}
