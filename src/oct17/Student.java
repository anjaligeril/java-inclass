package oct17;

public class Student {
	String name;
	int age;

	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		Student s2=new Student(3,"Aiden");
		s2.display();
		Student s3=new Student(28,"lini");
		s3.display();
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	Student(){
		age=28;
		name="anjali";
	}
	Student(int age1,String name1){
		age=age1;
		name=name1;
	}
	

}
