package exercises;

public class Methods {

	public static void main(String[] args) {
		// Methods
		
		String firstName = "Gabriel";
		String lastName = "Pereira";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Eduardo", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}

	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
}
