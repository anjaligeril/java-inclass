package javaInputOutput;

import java.io.*;

public class DemoFileInputOutputEg {

	public static void main(String[] args) {
		try {
			
			//write into file
			
			FileOutputStream output=new FileOutputStream("demo.dat");
			for(int i=0;i<10;i++) {
				output.write(i);
			}
			output.close();
			System.out.println("Written Successfully");
			
			//read from file
			
			FileInputStream input=new FileInputStream("demo.dat");
			int a;
			while((a=input.read())!=-1) {
				System.out.println(a);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
