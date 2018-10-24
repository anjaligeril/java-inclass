package oct23;

public class Truck extends Vehicle{

	private int tunnage;
	
	Truck(String make,String model,int year,int tunnage){
		super(make,model,year);
		this.tunnage=tunnage;
		}
	
	public void print() {
		super.print();
		System.out.println("Tunnage "+this.tunnage);
	}
}
