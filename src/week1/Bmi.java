package week1;

import java.util.*;

public class Bmi {
public static void main(String[] args) {
	int weightPound,heightInch;
	double weightKg,heightMeter,bmi;
	final double inch=0.0254;
	final double pound=2.2046;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the weight in pound");
	weightPound=input.nextInt();
	System.out.println("Enter the height in inch");
	heightInch=input.nextInt();
	weightKg=weightPound/pound;
	heightMeter=heightInch*inch;
	bmi=weightKg/Math.pow(heightMeter,2);
	if(bmi<18.5) {
		System.out.println("Underweight");
	}else if(bmi>=18.5 && bmi<25.0) {
		System.out.println("Normal");
	}else if(bmi>=25.5 && bmi<30.0) {
		System.out.println("overweight");
	}else {
		System.out.println("obese");
	}
}
}
