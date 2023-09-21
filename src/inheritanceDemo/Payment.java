package inheritanceDemo;

public class Payment extends Homepage {
	
	public void payments() {
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment obj = new Payment();
		
		login("admin", "admin@");
		obj.Homepagetest();
		obj.payments();
		obj.logout();
		
		

	}

}
