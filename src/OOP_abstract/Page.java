package OOP_abstract;

public abstract  class Page {
	
	//abstraction mean hidding the implementation of the features
	public Page() {
		System.out.println(" page constructor");
		
	}
	
	public Page(int i) {
		System.out.println("1 param page constructor"+ i);
		
	}
	
	// can't create the object of abstract class
	//but can create the constructor of abstract class
	//constructor will be called when we create the object of child class
	//not a mandatory to have abstract methods in abstract class
	
	
	public abstract void title() ;
	public abstract void url() ;
	
	public void calculatePageLoadTimeOut(){
		System.out.println("page time out --10secs");
	}
	public final void displayLogo() {
		
	}
	
	 public static void footer() {
		 System.out.println("page footer");
	 }


}
