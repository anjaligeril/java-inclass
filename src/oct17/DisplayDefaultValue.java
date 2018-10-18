package oct17;

public class DisplayDefaultValue {
	int i;
	String s;

	public static void main(String[] args) {
		DisplayDefaultValue d1=new DisplayDefaultValue();
		d1.display();
		DisplayDefaultValue d2=new DisplayDefaultValue();
		d2.display();
	}
	
	
	void display() {
		System.out.println(i);
		System.out.println(s);
	}
	
	DisplayDefaultValue(){
		i=10;
		s="hello";
	}
}
