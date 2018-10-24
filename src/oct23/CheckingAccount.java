package oct23;

public class CheckingAccount extends Account{

	CheckingAccount(long amount){
		super("Checking",amount);
	}
	
	public void withdraw(long amount) {
		setAmount(getAmount()-amount);
	}
}
