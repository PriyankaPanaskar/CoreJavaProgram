package InheritanceDemo;

public class ChildClass extends BaseClass{

	public static void main(String[] args) {
		ChildClass obj1= new ChildClass();
		obj1.add();
		obj1.sub();
		obj1.Multiplication();
		obj1.Divi();
		

	}
	public void Multiplication() {
		System.out.println("Multiplication");
	}
	
	public void Divi() {
		System.out.println("Division");
	}
}
