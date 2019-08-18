package JavaTest;

/**
 * @author ankumara
 *  Inheritance - Single inheritance. 
 * Class MountainBikes inherits base class Bicycle.
 * used constructors, this and super keywords
 */


public class Bicycle {
	private int gear;
	public int speed;
	 
	public int getGear() {
		return gear;
	}
	
	public void setGear(int value) {
		gear = value;
		
	}
	
//constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed; 
	}
	
//the Class bicyle has 3 methods
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void sppedUp(int increment) {
		speed += increment; 
	}
	
	public String toString() {
		return ("No of gears are " +gear+"\n"+ "Speed of the Bicycle is "+speed);
	}
}


