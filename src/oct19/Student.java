package oct19;

public class Student {

	int studentId;
	String name;
	
	void show() {
		
		System.out.println("Student id "+studentId+" name "+name);
		
	}
	
	Student(int studentId,String name){
		
		//this is referring the instance variable of current class And RHS is local variable of student constructor
		
		this.studentId=studentId;
		this.name=name;
	}
	
}
