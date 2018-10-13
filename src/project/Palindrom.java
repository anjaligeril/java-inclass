package project;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the strings");
		String word1=input.next();
		System.out.println("word "+word1);
		
		int length=word1.length(),i;
		String word2="";
		for(i=length-1;i>=0;i--) {
			word2=word2+word1.charAt(i);
		}
		System.out.println("Reverse word "+word2);
		boolean val=word1.equals(word2);
		
		if(val) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
}
}
