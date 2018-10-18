package oct16;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[][] arr= new int[4][3];
		int sum=0;
		System.out.println("Enter the elements of array ");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=arr[i][j]+sum;
			}
			System.out.println("Sum row "+sum);
			sum=0;

		}
		int sum1=0;
		//System.out.println("Sum "+sum);
		for(int j=0;j<3;j++) {
			for (int i=0;i<4;i++) {
				sum1=sum1+arr[i][j];
			}
			System.out.println("Sum column "+sum1);
			sum1=0;
		}
	}

}
