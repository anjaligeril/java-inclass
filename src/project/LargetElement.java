package project;

import java.util.Scanner;

public class LargetElement {
	public static void main(String[] args) {
		int[][] a= new int[10][10];
		int row,col;
		System.out.println("Enter the number of row and columns of array ");
		Scanner obj=new Scanner(System.in);
		row=obj.nextInt();
		col=obj.nextInt();
		System.out.println("Enter the elements of array ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=obj.nextInt();
			}
		}
		
		System.out.print("\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		int max=a[0][0],row1=0,col1=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
					row1=i;
					col1=j;
				}
			}
			
		}
		System.out.print("max value is "+max+"\n row "+row1+"\ncolumn "+col1);
	}
}
