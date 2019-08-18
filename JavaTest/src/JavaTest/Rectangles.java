package JavaTest;

public class Rectangles extends Shape{
	double length;
	double width;
	
	public Rectangles (String color, double length, double width) {
		super(color);
		System.out.println("Rectangle Constructor has been called");
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return "Rectangle color is "+super.color + " and area is "+area();
	}
	

}
