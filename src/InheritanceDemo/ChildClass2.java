package InheritanceDemo;

public class ChildClass2 extends BaseClass{

	public static void main(String[] args) {
		BaseClass obj1= new BaseClass();
		obj1.add();
		obj1.sub();
		
		//You can not access mothosds of child class if base class reference created
		//obj1.Multiplication();
		//obj1.Divi();
		

	}
	public void Multiplication() {
		System.out.println("Multiplication");
	}
	
	public void Divi() {
		System.out.println("Division");
	}
}
