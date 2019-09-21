package PassParameter;

public class PassParameters {

	public static void main(String[] args) {
		PassParameters obj= new PassParameters();
		obj.add(455, 78);
		
		obj.sub(789.65, 56.65);

	}
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Result is  "+ c);
		
	}
	
	public void sub(double x, double y)
	{
		double result= x-y;
		System.out.println("Sub Result "+ result);
	}

}
