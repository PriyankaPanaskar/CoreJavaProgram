package ArrayDemo;

public class ObjectClassDemo {

	public static void main(String[] args) {
		//Object class
		
		Object ob[]=new Object[6];
		ob[0]="Priyanka";
		ob[1]=29;
		ob[2]=5.6;
		ob[3]=1/1/1990;
		ob[4]="F";
		ob[5]="Texas";
		
		for(int i=0; i <ob.length;i++)
		{
			System.out.println(ob[i]);
		}
				
		
		
	}

}
