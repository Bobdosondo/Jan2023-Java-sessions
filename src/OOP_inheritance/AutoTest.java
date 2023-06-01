package OOP_inheritance;

public class AutoTest {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//own individual 
		b.engine();//inherited
		b.petrolEngine();
		b.theftSafety();//individual
		
		System.out.println("------>");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//inherited
		c.petrolEngine();
		
		System.out.println("------->");
		
		//child class object can be referred by parent 
		//class ref variable:top /up casting
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//c1.autoparking();//not allowed for individual methods--ref type check is failed
		
		
		//down casting
		//parent class object can be referred by child 
		//class variable
		
		BMW b1 =(BMW)new Car();//ClassCasException
		//down casting is allowed at the compile time but at the runtime no
		
		
		
		
	}

}
