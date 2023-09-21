package inheritanceDemo;

public class Homepage extends Base{
	
	public void Homepagetest()
	{
		System.out.println("Test for Home Page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homepage obj = new Homepage();
		login("admin", "admin");
		obj.Homepagetest();
		obj.logout();

	}

}
