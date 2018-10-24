package oct23;

public class TestPrivate1 {

	public static void main(String[] args) {
		Address a=new Address();
		System.out.println(a.getPhone());
		a.setPhone("1247856935");
		System.out.println(a.getPhone());
		a.setPhone("987654321");
		System.out.println(a.getPhone());
		
	}

}

class Address{
	
	private String phone="123456789";
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if(phone.length()==9) {
			this.phone=phone;
			System.out.println("The phoneno reset");
		}else
		{
			System.out.println("The phoneno not reset");
		}
		
	}
	
}