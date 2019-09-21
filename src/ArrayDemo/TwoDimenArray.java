package ArrayDemo;

public class TwoDimenArray {

	public static void main(String[] args) {
		String x[][]= new String[3][5];
		
		System.out.println("Total Number of Rows  "+ x.length);// 3Total number of rows
		
		System.out.println("Total Number Of Column  "+ x[0].length);// 5Total number of column
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		x[1][0]="F";
		x[1][1]="G";
		x[1][2]="H";
		x[1][3]="I";
		x[1][4]="J";
		
		x[2][0]="H";
		x[2][1]="I";
		x[2][2]="J";
		x[2][3]="K";
		x[2][4]="L";
		
		System.out.println(x[1][0]);
		
		for(int i=0; i<x.length;i++)
		{
			for(int j=0; j<x[0].length; j++)
			{
				System.out.println("\t"+x[i][j]);
			}
			System.out.println("   ");
		}
		
		
	}	

}
