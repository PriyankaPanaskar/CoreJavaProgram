package CompilePolyMorphism;

public class compileDemo1 {

	public static void main(String[] args) {
		compileDemo1 obj1=new compileDemo1();
		obj1.add(45.45, 85.85);
		obj1.add(180, 60);
		obj1.add(5, 10);
		obj1.add(20, 40, 60);
		obj1.add(90, 620.1);

	}
	public void add(double a, int b)
	{
		double c= a+b;
		System.out.println("Sum of two number is "+ c);
	}
	
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println("Sum of two number is "+ c);
	}
	
	
	public void add(double a, double b)
	{
		double c= a+b;
		System.out.println("Sum of two number is "+ c);
	}
	

	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum of two number is "+ c);
	}
	
	public void add(int a, int b, int d)
	{
		int c= a+b+d;
		System.out.println("Sum of two number is "+ c);
	}
}
