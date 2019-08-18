package JavaTest;

abstract public class Shape {
	String color; 
	//abstract methods
	
	abstract double area();
	public abstract String toString();
	
	// Constructor
	public Shape(String color) { 
		System.out.println("Shape constructor has been called ");
		this.color = color;
	}
	public String getColor() {
		return color;
	}

}
