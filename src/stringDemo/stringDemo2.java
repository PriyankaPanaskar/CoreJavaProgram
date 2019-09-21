package stringDemo;

public class stringDemo2 {

	public static void main(String[] args) {
		String actuals="Welcome To Selenium World";
		String expected="Welcome to selenium world";
		boolean status=actuals.equals(expected);
		System.out.println("First Status is "+status);
		
		
		boolean status2=actuals.equalsIgnoreCase(expected);
		System.out.println("Second Status is "+status2);
	}

}
