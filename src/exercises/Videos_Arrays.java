package exercises;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
//		Example 1:
		
//		String student1Name = "John Doe";
//		String student2Name	= "Joe Schmoe";
//		String student3Name = "Joe Bloggs";
//		String student4Name = "Jane Doe";
//		String student5Name = "Jane Smith";
//		String student6Name = "So-and-so";
//		String student7Name = "Fred Bloggs";
//		String student8Name = "Joe Anybody";

		String[] students = new String[8];
		
		students[0] = "John Doe";
		students[1] = "Joe Schmoe";
		students[2] = "Joe Bloggs";
		students[3] = "Jane Doe";
		students[4] = "Jane Smith";
		students[5] = "So-and-so";
		students[6] = "Fred Bloggs";
		students[7] = "Joe Anybody";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
		System.out.println(students[4]);
		System.out.println(students[5]);
		System.out.println(students[6]);
		System.out.println(students[7]);
		
		System.out.println();
		
//		Or you can do the following:
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
//		Enhanced for loops or for-each loops:
		System.out.println();
		System.out.println("Enhanced for loops or for-each loops:");
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		
//		Example 2:
		
		String[] products = new String[5];
		products[0] = "Beans";
		products[1] = "Rice";
		products[2] = "Onions";
		products[3] = "Milk";
		products[4] = "Sauce";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		System.out.println();
		
		
//		Example 3:
		
		int[] multiplesOf3 = new int[10];
		multiplesOf3[0] = 3;
		multiplesOf3[1] = 6;
		multiplesOf3[2] = 9;
		multiplesOf3[3] = 12;
		multiplesOf3[4] = 15;
		multiplesOf3[5] = 18;
		multiplesOf3[6] = 21;
		multiplesOf3[7] = 24;
		multiplesOf3[8] = 27;
		multiplesOf3[9] = 30;
		
		for (int multipleOf3 : multiplesOf3) {
			System.out.println("Multiple of 3: " + multipleOf3);
		}
		System.out.println();
		
//		Or you can do a for loop:
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("Number: " + multiplesOf3[i - 1]);
		}
		System.out.println();
		
//		Alternatively, you can also do:
		
		for (int i = 0; i < multiplesOf3.length; i++) {
			multiplesOf3[i] = (i + 1) * 3;
			System.out.println("The answer is: " + multiplesOf3[i]);
		}
		
	}

}
