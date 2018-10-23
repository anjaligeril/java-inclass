package oct22;

public class Super3 {

	public static void main(String[] args) {
		
		Fish2 f=new Fish2();
	}

}

class Animal2{
	String color="black";
	
	Animal2(){
		System.out.println("Animal created");
	}
	
	
}
class Fish2 extends Animal2{
	
	Fish2(){
		//super();
		System.out.println("Fish created");
	}
}