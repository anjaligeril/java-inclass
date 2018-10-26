package project;

public class DemoFan {

	public static void main(String[] args) {
		Fan f=new Fan();
		System.out.println(f.toString());
		
		Fan f1=new Fan();
		f1.setSpeed(3);
		f1.setOn(true);
		f1.setRadius(10);
		f1.color="yellow";
		
		System.out.println(f1.toString());
		
		Fan f2=new Fan();
		f1.setSpeed(2);
		f1.setOn(false);
		f1.setRadius(5);
		f1.color="blue";
		
		System.out.println(f2.toString());

	}

}

class Fan{
	
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	public int getSpeed() {
		return(this.speed);
	}
	
	public void setSpeed(int speed) {
	
		this.speed=speed;
		
	}
	
	public boolean getOn() {
		return(this.on);
	}
	
	public void setOn(boolean on) {
		this.on=on;
	}
	
	public double getRadius() {
		return(this.radius);
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	Fan(){
		speed=SLOW;
		on=false;
		radius=5;
		color="blue";
	}
	
	public String toString() {
		if(this.on) {
			return(this.speed+" "+this.color+" "+this.radius);
		}
		else {
			return(this.color+" "+this.radius+" "+"fan is off");
		}
	}
}