package oct17;

public class Square {
	
	int length;
	static int count=0;
	
	public static void main(String[] args) {
		
		Square square1=new Square();
		int p1=square1.getPerimeter();
		int a1=square1.getArea();
		
		Square square2=new Square(10);
		int p2=square2.getPerimeter();
		int a2=square2.getArea();
		
		Square square3=new Square(20);
		int p3=square3.getPerimeter();
		int a3=square3.getArea();
		
		System.out.println("Square1 area "+a1+"perimeter "+p1);
		
		System.out.println("Square2 area "+a2+"perimeter "+p2);
		
		System.out.println("Square3 area "+a3+"perimeter "+p3);
		
		System.out.println("count "+Square.noOfObj());
	}
	Square(){
		length=2;
		count++;
	}
	
	Square(int len){
		length=len;
		count++;
	}
	
	int getPerimeter() {
		int perimeter;
		perimeter=4*length;
		return perimeter;
	}
	
	int getArea() {
		int area;
		area=length*length;
		return area;
	}
	
	static int noOfObj() {
		return count++;
	}
	
	public static void printSquare( Square s) {
		System.out.println(" area of  "+s.length+" is "+s.getArea()+" "+s.getPerimeter());
	}


}
