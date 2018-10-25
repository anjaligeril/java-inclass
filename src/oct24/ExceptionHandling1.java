package oct24;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		 int n1,n2;
		 double result;
		 System.out.println("Enter the values ");
		 Scanner obj=new Scanner(System.in);
		 n1=obj.nextInt();
		 n2=obj.nextInt();
		 
		 //without using exception handling 
		 /*
		 if(n2==0) {
			 System.out.println("divisor cant be zero"); 
		 }
		 else {
			 result=n1/n2;
			 System.out.println("result is "+result);
		 }*/
		 
		 //with exception handling
		 
		 try {
			 
			 if(n2==0) 
				 throw new ArithmeticException("not possible"); 
			 System.out.println("result is "+(n1/n2));
		 }
		 catch(ArithmeticException ex) {
			 System.out.println("divisor cant be zero");
			 System.out.println(ex.getMessage());
		 }
		
		 finally {
			 System.out.println("bye"); 
		 }
		
	}

}
