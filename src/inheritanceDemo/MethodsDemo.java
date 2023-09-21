package inheritanceDemo;

public class MethodsDemo {

	
		public void login()
		{
			System.out.println("Enter username");
			System.out.println("Enter Password");
			System.out.println("sign into mailbox");
		}
		
		 public void ComposeEmail()
		 {
			 System.out.println("Compose an email");
		 }
		 
		 public void logout()
		 {
			 System.out.println("click on logout button");
		 }
		 
		 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
			 MethodsDemo obj = new MethodsDemo();
			 
			 obj.login();
			 obj.ComposeEmail();
			 obj.logout();
			 

	}

}
