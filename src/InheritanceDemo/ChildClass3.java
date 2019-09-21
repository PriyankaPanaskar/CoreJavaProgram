package InheritanceDemo;

public class ChildClass3 extends BaseClass{

	public static void main(String[] args) {
		BaseClass obj1= new ChildClass();
		obj1.add();
		obj1.sub();
		
		/*You can not access methods of child class if base class reference created
		obj1.Multiplication();
		obj1.Div();*/
		

	}
	public void Multiplication() {
		System.out.println("Multiplication");
	}
	
	public void Divi() {
		System.out.println("Division");
	}
}
