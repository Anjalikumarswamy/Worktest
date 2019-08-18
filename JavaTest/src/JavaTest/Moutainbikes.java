package JavaTest;
//Derived class

public class Moutainbikes extends Bicycle{

public int seatHeight;
		
//sub class has the constructor
		
public  Moutainbikes(int gear, int speed, int seatHeight) {
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	
//one method in the subclass
public void setSeat(int newValue) {
	this.seatHeight = newValue;
 }

@Override
public String toString() {
	return (super.toString() + "\n Seat Height is "+seatHeight);
}
}