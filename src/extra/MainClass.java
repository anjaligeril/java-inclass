package extra;

public class MainClass {

	public static void main(String[] args) {
		A a=new B();
		
		System.out.println(a.b);
	}

}

class A{
	int b=50;
}

class B extends A{
	
	int b=20;
	B(){
		int b=70;
	}
}