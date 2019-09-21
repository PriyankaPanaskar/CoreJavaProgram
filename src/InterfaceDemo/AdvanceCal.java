package InterfaceDemo;

public class AdvanceCal implements Calci{

	public static void main(String[] args) {
		AdvanceCal obj1= new AdvanceCal();
		obj1.add();
		obj1.sub();
		obj1.CalculateSin();
		obj1.CalculateCos();
		
		
	}
	
	public void CalculateSin()
	{
		System.out.println("I am in Cal Sin method");
	}
	
	public void CalculateCos()
	{
		System.out.println("I am in Cal Cos method");
	}

	@Override
	public void add() {
		System.out.println("I am in Addition method");
		
	}

	@Override
	public void sub() {
		System.out.println("I am in Substraction method");
		
	}

}
