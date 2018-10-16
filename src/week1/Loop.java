package week1;

public class Loop {

	public static void main(String[] args) {
		for(int x=10;x<20;x=x+1) {
			System.out.println("x "+x);
		}
		
		int i=10;
		while(i<20) {
			System.out.println("i "+i);
			i++;
		}
		
		int j=10;
		do {
			System.out.println("j "+j);
			j++;
		}while(j<20);
	}
	
	

}
