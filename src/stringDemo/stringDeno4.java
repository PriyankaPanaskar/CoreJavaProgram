package stringDemo;

public class stringDeno4 {

	public static void main(String[] args) {
	String fullname="Selenium-HP-QTO-Grid";
	
	String[]toolname=fullname.split("-");
	
	for(int i=0;i<toolname.length;i++)
	{
		System.out.println("value for " +i+ " is " +toolname[i]);
		if(toolname[i].equalsIgnoreCase("HP"))
		{
			System.out.println("Pass the test word found "+toolname[i]);
			break;
		}

	}

}
}
