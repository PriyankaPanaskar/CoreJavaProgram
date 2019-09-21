package stringDemo;

public class stringDemo3 {

	public static void main(String[] args) {
		String actuals="Welcome To Selenium World";
		String expected="Priya";
		boolean status=actuals.contains(expected);
		System.out.println("First Status is "+status);
		
		String expected1="Selenium";
		boolean status2=actuals.contains(expected1);
		System.out.println("First Status is "+status2);
		
		
		
	}

}
