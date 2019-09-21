package OopConceptBasic;

public class Car {
	
	//Create class veriable
	
	int model;
	int wheel;
	String name;

	public static void main(String[] args) {
		
		
		Car obj1= new Car();
		obj1.model=2015;
		obj1.wheel=4;
		obj1.name="BMW";
		System.out.println(" "+obj1.model +" "+ obj1.name +" "+obj1.wheel);
		
		
		Car obj2= new Car();
		obj2.model=2019;
		obj2.wheel=4;
		obj2.name="Acura";
		System.out.println(" "+obj2.model +" "+ obj2.name +" "+obj2.wheel);
	}

}
