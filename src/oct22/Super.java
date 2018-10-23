package oct22;

public class Super {

	public static void main(String[] args) {
	
		Fish f=new Fish();
		f.printColor();

	}

}

class Animal{
	String color="black";
}
class Fish extends Animal{
	String color="pink";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}