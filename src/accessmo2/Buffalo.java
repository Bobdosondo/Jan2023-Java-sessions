package accessmo2;

import accessmo1.Animal;

public class Buffalo extends Animal {

	public static void main(String[] args) {
		Buffalo b = new Buffalo();
		b.eagle();//protected
		b.wildDog();//public
		
		//private and default not accessible if package is different even inherited
	
	}

}
