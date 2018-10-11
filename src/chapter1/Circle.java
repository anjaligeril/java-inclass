package chapter1;

public class Circle {

	public static void main(String[] args) {
		double radius,areaResult,perimeterResult;
		radius=3.0f;
		areaResult=area(radius);
		System.out.printf("The Area is \t %.3f\n",areaResult);
		perimeterResult=perimeter(radius);
		System.out.printf("The Perimeter is \t %.3f",perimeterResult);
	}
	
	public static double area(double radius) {
		double result;
		result=3.14*radius*radius;
		return result;
	}
	public static double perimeter(double radius) {
		double result;
		result=2*3.14*radius;
		return result;
	}
}
