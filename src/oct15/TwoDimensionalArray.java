package oct15;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a= new int[5][5];
		System.out.println("Enter the elements of array ");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=obj.nextInt();
			}
		}
		
		System.out.print("\n");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
