package inheritanceDemo;

public class Base {
	
	public void printmethod() 
	{
		System.out.println("The global integer variable : " + x);
		System.out.println("The global String variable : " + str3);
	}
	public static void login(String username,String password)
	{
		System.out.println("Enter username: " + username);
		System.out.println("Enter Password; " + password);
		System.out.println("Sign into mailbox");
	}
	public void logout()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
