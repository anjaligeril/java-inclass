package oct23;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	
	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	void print() {
		System.out.println("make "+make);
		System.out.println("model "+model);
		System.out.println("year "+year);
	}
}
