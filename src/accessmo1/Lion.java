package accessmo1;

public class Lion extends Animal {

	public static void main(String[] args) {
		
		Lion l=new Lion();
		l.chicken();//default
		l.eagle();//protected
		l.wildDog();//public
		
		//private is not accessible in same package different class even inherited
		
	}

}
