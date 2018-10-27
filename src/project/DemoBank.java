package project;

//method overriding

public class DemoBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		TD t=new TD();
		RBC r=new RBC();
		System.out.println("Interest in TD "+b.Interest());
		System.out.println("Interest in TD "+t.Interest());
		System.out.println("Interest in RBC "+r.Interest());
	}

}

class Bank{
	double Interest() {
		return 1.5;
	}
}

class TD extends Bank{
	
	double Interest() {
		return 2.0;
	}
}

class RBC extends Bank{
	
	double Interest() {
		return 2.5;
	}
}