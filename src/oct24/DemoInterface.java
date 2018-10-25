package oct24;

public class DemoInterface  {

	public static void main(String[] args) {
		/*Fruit f=new Fruit();
		System.out.println(f.howToEat());*/
		
		Apple a=new Apple();
		System.out.println(a.howToEat());
		
		Orange o=new Orange();
		System.out.println(o.howToEat());
		
		Chicken c=new Chicken();
		System.out.println(c.howToEat());
	}

}

/*class Fruit implements Edible{
	
	public String howToEat() {
		return("eat");
	}
}*/

abstract class Fruit implements Edible{
	
}

class Apple extends Fruit{
	public String howToEat() {
		return("Apple: make slice");
	}
}

class Orange extends Fruit{
	public String howToEat() {
		return("Orange : make juice");
	}
}

class Chicken implements Edible{
	public String howToEat() {
		return("chicken : make fry");
	}
}