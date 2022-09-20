package exercises;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		String student1Name = "John Doe";
		String student2Name	= "Joe Schmoe";
		String student3Name = "Joe Bloggs";
		String student4Name = "Jane Doe";
		String student5Name = "Jane Smith";
		String student6Name = "So-and-so";

		String[] students = new String[6];
		
		students[0] = "John Doe";
		students[1] = "Joe Schmoe";
		students[2] = "Joe Bloggs";
		students[3] = "Jane Doe";
		students[4] = "Jane Smith";
		students[5] = "So-and-so";
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println();
		
		for (String student : students) {
			System.out.println(student);
		}
	
	}

}
