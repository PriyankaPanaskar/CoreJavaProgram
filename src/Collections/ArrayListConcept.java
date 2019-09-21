package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//Static Array = Size fix is fixed
		//int a[]=new int[3];
		
		/*Dynamic Array -- ArrayList
		 * 1. Duplicate value
		 * 2. Maintain insertion order
		 * 3. It is not synchronize(Slow as compaire to other collection)
		 * 4. allow you random access to fetch any element because it stores value on the basic of index */
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());// Size of array
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		
		ar.add(60.50);
		ar.add("Test");
		ar.add(true);
		System.out.println(ar.size());// Size of array
		
		
		//Print all values from array list : for loop or Using iterator
		
		//for loop
		for(int i =0; i<ar.size(); i++)
		{
			System.out.print(" "+ ar.get(i));
			
		}
		System.out.println(" ");
		
		// Non Generic vs generic
		
		ArrayList<Integer> arInt1 = new ArrayList<Integer>();
		arInt1.add(100);
		//arInt1.add("Selenium"); Wrong
		
		//ArrayList<E> arInt2 = new ArrayList<E>(); Not sure about values coming
		
		// Employee class
		Employee e1= new Employee("Priyanka", 29, "QA");
		Employee e2= new Employee("Ridhaan", 2, "Admin");
		Employee e3= new Employee("Siddharth", 34, "Selenium");
		
		ArrayList<Employee> ar3= new ArrayList<Employee>();
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//Iteratir to traverse the value 
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp= it.next();
			
			System.out.print(" "+ emp.name);
			System.out.print(" "+ emp.age);
			System.out.print(" "+ emp.dept);
			System.out.println("");
		}
		
		
		
		
		
		
	}

}
