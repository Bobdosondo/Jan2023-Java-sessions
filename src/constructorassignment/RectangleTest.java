package constructorassignment;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.length=10.5;
		r.width =7.25;
		System.out.println(r.length* r.width);
		
		Rectangle r1 = new Rectangle(10, 2.50);
		System.out.println(r1.length*r1.width);
		
		r1.calculateArea(10, 2.50);
		
		
	}

}
