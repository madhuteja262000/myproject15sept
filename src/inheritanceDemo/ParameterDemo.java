package inheritanceDemo;

public class ParameterDemo {
	
	public void login(String username,String password)
	{
		System.out.println("Enter username: " + username);
		System.out.println("Enter Password; " + password);
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an email with text as: " + text);
	}
	
	public void logout()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterDemo obj = new ParameterDemo();
		
		obj,login("teja", "teja@gmail.com");
		obj.ComposeEmail("Hello All");
		obj.logout();
	}

}
