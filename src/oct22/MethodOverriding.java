package oct22;

public class MethodOverriding {

	public static void main(String[] args) {
		ACollege a=new ACollege();
		BCollege b=new BCollege();
		CCollege c=new CCollege();
		System.out.println(a.getFees());
		System.out.println(b.getFees());
		System.out.println(c.getFees());
	}

}

class College{
	int getFees() {
		return 50;
	}
}

class ACollege extends College{
	int getFees() {
		return 100;
	}
}

class BCollege  extends College{
	int getFees() {
		return 80;
	}
}

class CCollege  extends College{
	int getFees() {
		return 60;
	}
}