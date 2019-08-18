package JavaTest;

public class Inhertitance {

	public static void main(String[] args) {
  
		Bicycle b = new Bicycle(3,5);
		System.out.println(b.toString());
		b.applyBrake(1);
		System.out.println(b.toString());
		
		Moutainbikes mb = new Moutainbikes(7, 5, 9);
		System.out.println(mb.toString());	
		mb.applyBrake(4);
		System.out.println(mb.toString());	
		
	}

}
