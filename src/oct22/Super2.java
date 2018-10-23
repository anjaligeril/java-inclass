package oct22;

public class Super2 {

	public static void main(String[] args) {
		Fish1 f=new Fish1();
		f.eat();

	}

}

class Animal1{
	String color="black";
	
	void eat() {
		System.out.println("eat method of parent");
	}
	
	
}
class Fish1 extends Animal1{
	String color="pink";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat() {
		super.eat();
		System.out.println("eat method of child");
		
	}
}