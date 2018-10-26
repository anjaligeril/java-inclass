package project;

import java.util.Scanner;

public class ExceptionArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] a=new int[100];
		
		for(int i=0;i<100;i++) {
			a[i]=(int)(Math.random()*100);
		}
		
		System.out.println("The elements in the array are");
		
		for(int i=0;i<100;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		System.out.println("Enter the index for which value need to showed");
		int index;
		Scanner obj=new Scanner(System.in);
		
		try {
			index=obj.nextInt();
			System.out.println("array value at index "+index+" is "+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("You need to enter a valid index between 0 1nd 99");
		}
		/**/

	}

}
