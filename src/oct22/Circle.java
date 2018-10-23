package oct22;

public class Circle {
	private double radius;

	 Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
		
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public static void main(String[] args) {
		B1 b=new B1(20.0,10);
		System.out.println(b.getRadius());
		System.out.println(b.getArea());
	}
}


class B1 extends Circle{
	private double length;
	
	B1(double radius,double length){
		super(radius);
		this.length=length;
	}
	
	public double getArea() {
		return super.getArea()*length;
	}
}