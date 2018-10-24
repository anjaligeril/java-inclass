package oct23;

public class DemoAccount {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount(3698);
		System.out.println(sa.getName());
		System.out.println(sa.getAmount());
		sa.deposit(1234);
		System.out.println(sa.getAmount());
		
		CheckingAccount ca=new CheckingAccount(7896);
		System.out.println(ca.getName());
		System.out.println(ca.getAmount());
		ca.deposit(1234);
		System.out.println("deposit "+ca.getAmount());
		ca.withdraw(1000);
		System.out.println("withdraw "+ca.getAmount());

	}

}
