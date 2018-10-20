package oct19;

public class InvokeMethodUsingThis {

	public static void main(String[] args) {
		
		A a=new A();
		a.m2();
	}
	
	

}

class A{
	
	void m1() {
		System.out.println("Method 1 called");
	}
	
	void m2() {
		System.out.println("Method 2 called");
		this.m1();
	}
}
