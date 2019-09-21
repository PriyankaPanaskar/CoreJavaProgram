package PassParameter;

public class PassParametersReturnValue {

	public static void main(String[] args) {
		DynamicCalculator obj= new DynamicCalculator();
		
		int sum= obj.add(455, 78);
		System.out.println("Access dynamic class for Addition : "+sum);
	
		obj.sub(789.65, 56.65);

		String fullname= DynamicCalculator.getMyFullName("Priyanka", "Panaskar");
		System.out.println("My Full Name  "+ fullname);
		
	}
	
	
}
