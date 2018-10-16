package week1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year");
		year=input.nextInt();
		if(year%4==0 && (year%100!=0 )||year%400==0) {
			System.out.println("Leap year");
			
		}else {
			System.out.println("not Leap year");
		}
	}
}
