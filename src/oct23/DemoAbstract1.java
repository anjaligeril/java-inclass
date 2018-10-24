package oct23;

public class DemoAbstract1 {

	public static void main(String[] args) {
		Chicken c=new Chicken();
		System.out.println(c.sound());
		Tiger t=new Tiger();
		System.out.println(t.sound());

	}

}
 abstract class Animal{
	 private double weight;
	 
	 public double getWeight() {
		 return weight;
	 }
	 
	 public void setWeight(double weight) {
		 this.weight=weight;
	 }
	 
	 abstract public String sound();
 }
 
 class Chicken extends Animal{
	 public String sound() {
		 return("sound of chicken");
	 }
 }
 
class Tiger extends Animal{
	 public String sound() {
		 return("sound of Tiger");
	 }
 }
 
 /*class xTiger extends Tiger {
	 public String sound() {
		 return("sound of Tiger");
	 }
	 }*/
