package chapter1;

import java.util.Scanner;

public class CharacterMethods {

	public static void main(String[] args) {
		Character ch=new Character('a');
		String name = new String("Anjali" );
		String name1="aiden";
		System.out.println(ch.isLetter(ch));
		System.out.println(Character.toUpperCase('a'));
		System.out.println("Length is "+name.length());
		System.out.println("Length is "+name1.length());
		
		int len=name1.length();
		System.out.printf("Length is %d name is %s",len,name1);
		System.out.println("\n"+name1.charAt(1));
		
		String fname="Anjali ";
		String lname="Joseph";
		String fullName=fname.concat(lname);
		
		System.out.println(fname+" "+lname);
		
		System.out.println(fname.concat(lname));
		
		System.out.println(fullName.toUpperCase());
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the strings");
		String word1=input.next();
		String word2=input.next();
		System.out.println(word1.compareToIgnoreCase(word2));
		
		System.out.println(word1.equals(word2));
		System.out.println(word1.compareTo(word2));
	}
}
