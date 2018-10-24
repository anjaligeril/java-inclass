package oct23;

public class Account {

	private String name;
	private long amount;
	
	Account(String name,long amount){
		this.name=name;
		this.amount=amount;
	}
	
	public String getName() {
		return(this.name);
	}
	
	public long getAmount() {
		return (this.amount);
	}
	
	public void setAmount(long amount) {
		this.amount=amount;
	}
	
	public void deposit(long amount) {
		this.amount=this.amount+amount;
	}
}


