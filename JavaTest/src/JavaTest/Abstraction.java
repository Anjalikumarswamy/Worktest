package JavaTest;

public class Abstraction {

	public static void main(String[] args) {
	  Shape s1 = new Circle("Red", 2);
	  Shape s2 = new Rectangles("Blue", 2, 4);
	 // Circle c1 = new Circle("Red", 2);
	  
	  System.out.println(s1.toString());
	  System.out.println(s2.toString());
//	 System.out.println(c1.toString());
	}

}
