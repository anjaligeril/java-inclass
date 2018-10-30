package javaInputOutput;

import java.io.*;


public class DemoBufferedInputOutptEg {

	public static void main(String[] args) {
		//Buffered stream is used to speedup input and output by reducing no of disc read and write.
		
		//copy content from 1 file to another
		
		File sf=new File("demo.dat");
		File df=new File("demo1.dat");
		
		try {
			
			BufferedInputStream input=new BufferedInputStream(new FileInputStream(sf));
			BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(df));
			
			int r,count=0;
			while((r=input.read())!=-1) {
				output.write((byte)r);
				count++;
			}
			
			System.out.println(count);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
