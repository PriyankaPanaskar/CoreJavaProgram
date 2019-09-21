package PassParameter;

public class DynamicCalculator {

	
	
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	public void sub(double x, double y)
	{
		double result= x-y;
		System.out.println("Sub Result "+ result);
	}
	
	
	public static String getMyFullName(String firstName, String lastName)
	{
		String fullName= firstName+"  "+lastName;
		return fullName;
	}

}
