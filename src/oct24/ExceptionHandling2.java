package oct24;

import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.*;

public class ExceptionHandling2 {

	public static void main(String[] args) {
	
		 int n1,n2;
		 double result;
		 System.out.println("Enter the values ");
		 Scanner obj=new Scanner(System.in);
		 try {
			 n1=obj.nextInt();
			 n2=obj.nextInt(); 
		 }
		catch(InputMismatchException ex1) {
			System.out.println("type not correct");
		}

	}

}
