package project;

import java.util.Scanner;

public class Excercise1Circle {
	public static void main(String[] args) {
		
		double radius,areaResult,perimeterResult;
		final double PI=3.14159;
		
		//creating the object of scanner class
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		radius=input.nextDouble();
		
		areaResult=area(radius,PI);
		System.out.printf("The Area is \t %.3f\n",areaResult);
		
		perimeterResult=perimeter(radius,PI);
		System.out.printf("The Perimeter is \t %.3f",perimeterResult);
	}
	
	public static double area(double radius,double PI) {
		
		double result;
		result=PI*radius*radius;
		return result;
		
	}
	public static double perimeter(double radius,double PI) {
		
		double result;
		result=2*PI*radius;
		return result;
		
	}
}
