package oct19;

public class CallConstructorUsingThis {

	public static void main(String[] args) {
	
		B b=new B();
		
		C c=new C();
	}

}

class B{
	
	B(){
		this(4);
		System.out.println("The default constructor has been called..");
	}
	
	B(int i){
		
		System.out.println(i);
		
	}
}


class C{
	
	C(){
		
		System.out.println("The default constructor has been called..");
	}
	
	C(int i){
		this();
		System.out.println(i);
		
	}
}