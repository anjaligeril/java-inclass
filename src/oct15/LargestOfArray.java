package oct15;

import java.util.Scanner;

public class LargestOfArray {

	public static void main(String[] args) {
		int[] a=new int[5];
		int max=0;
		System.out.println("Enter the elements of array ");
		Scanner obj=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		 if(max < a[i]) {
			 max=a[i];
		 }
		}
		System.out.println(" max value "+max);

	

		for(int i:a) {
			System.out.print(i+" ");
			 if(max < i) {
				 max=i;
			 }
			}
			System.out.println(" max value "+max);	
	}
}
