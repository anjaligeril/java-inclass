package project;

public class DemoMultiLevelInheritance {

	public static void main(String[] args) {
		Fish1 f=new Fish1();
		f.eat();
		f.move();
		f.swim();
	
		GoldFish g=new GoldFish();
		g.move();
		g.eat();
		g.swim();
		g.shine();
		
		Animal1 a=new Animal1();
		a.eat();
		a.move();

	}

}
class Animal1 {
	public void move() {
		System.out.println("moving..");
	}
	public void eat() {
		System.out.println("eating..");
	}
}
class Fish1 extends Animal1 {
	public void swim() {
		System.out.println("swimmimg..");
	}
}
class GoldFish extends Fish1    {
	void shine() {
		System.out.println("shining..");
	}
}