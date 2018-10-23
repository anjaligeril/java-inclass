package oct22;


//final keyword in class

public class Bike extends Vehicle {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.speed();
	}
	void speed() {
		System.out.println("Speed of bike is  150km/hr");
	}

}

final class Vehicle{
	void speed() {
		System.out.println("Speed of bike is  60km/hr");
	}

}