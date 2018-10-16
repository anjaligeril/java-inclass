package week1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		a=input.nextInt();
		System.out.println(" number");
		if((a%2==0)&&(a%3==0)) {
			System.out.println("The number is divisible by 2 and 3");
		}
		if((a%2==0)||(a%3==0)) {
			System.out.println("The number is divisible by 2 or 3");
		}
		if((a%2==0)^(a%3==0)) {
			System.out.println("The number is divisible by either 2 or 3");
		}
	}
}
