package javaPrograms;

public class InbuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Madhu teja";
		
		//contain method
		if(title.contains("teja")) {
			System.out.println("title is valid. test case pass");
		}
		else {
			System.out.println("title is not valid. test case failed");
		}
		
		//equals method
		if(title.equals("Madhu teja")) {
			System.out.println("title is valid. test case pass");
		}
		else {
			System.out.println("title is not valid. test case failed");
		}
		
		//substring() method
		String title2 = "Practice Labs Java";
		
		String result = title2.substring(14);
		
		if(result.equals("Java")) {
			System.out.println("String is valid");
		}
		else {
			System.out.println("String is invalid");
		}
		
	}

}

