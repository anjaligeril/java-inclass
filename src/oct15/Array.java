package oct15;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println("Enter the elements of array ");
		Scanner obj=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int j:a) {
			System.out.println(j);
		}
	}
}
