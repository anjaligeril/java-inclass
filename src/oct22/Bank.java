package oct22;

public class Bank {
	
	String accountType="Savings";

	public static void main(String[] args) {
		TD t=new TD();
		RBC r=new RBC();
		System.out.println("Interest in TD "+t.Interest());
		System.out.println("Interest in RBC "+r.Interest());
	}
	
	final double Interest() {
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