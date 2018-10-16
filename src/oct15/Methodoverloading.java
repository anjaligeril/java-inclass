package oct15;

public class Methodoverloading {

	public static void main(String[] args) {
		
		int x=10,y=20,sum;
		//object creation
		
		Adder ad=new Adder();
		
		//sum=ad.add(x,y);
		//System.out.println(sum);
		
		//System.out.println(ad.mul(10,10));
		
		//System.out.println(ad.add(10,10,10));
		
		System.out.println(ad.add(4,5));
		System.out.println(ad.add(4,5.4));
		System.out.println(ad.add(4.5,5.4));
	}

}

//creating new class

class Adder{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(int a,double b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
}
