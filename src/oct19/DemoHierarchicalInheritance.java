package oct19;

public class DemoHierarchicalInheritance {

	public static void main(String[] args) {
	
		Fish f=new Fish();
		f.eat();
		f.move();
		f.swim();
		
		System.out.println("\nlion\n ");
		
		Lion l=new Lion();
		l.eat();
		l.move();
		l.roar();
		
	}

}
