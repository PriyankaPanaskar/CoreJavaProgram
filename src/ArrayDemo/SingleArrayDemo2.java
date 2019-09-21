package ArrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		int student_id[]=new int[5];
		student_id[0]=89;
		student_id[1]=90;
		student_id[2]=99;
		student_id[3]=65;
		student_id[4]=70;
		//Limitation of array
		System.out.println("Student id is "+student_id[4]);
		
		int sizeofArray= student_id.length;
		System.out.println("Length of Array " +sizeofArray);
		
		for(int i=0; i <sizeofArray; i++)
		{
			System.out.println("Student id is "+student_id[i]);
		}
		

	}

}
