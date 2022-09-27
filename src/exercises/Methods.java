package exercises;

import java.util.Scanner;

public class Methods {

//	public static void main(String[] args) {
//		// Methods
//		
//		String firstName = "Gabriel";
//		String lastName = "Pereira";
//		String fullName = createFullName(firstName, lastName);
//		String fullName2 = createFullName("Eduardo", lastName);
//		
//		System.out.println(fullName);
//		System.out.println(fullName2);
//		
//	}
//
//	public static String createFullName(String x, String y) {
//		return x + " " + y;
//	}
	
	
	
	/*
	 * Main method here:
	 */
	
	public static void main (String[] args) {
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println (sumArray(myArray)); 
		
		double[] grades = new double [5];
		grades[0] = 88;
		grades[1] = 72;
		grades[3] = 89;
		grades[4] = 69;

		
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 5));
		
	}
		
	
	/*
	 * Create a method that takes an array of ints and returns the sum of all the ints
	 */
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/*
	 * Create a method that takes an array of doubles and returns the average of all elements in the array
	 */
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	/*
	 * Create a method that takes a String and an int and returns the String concatenated with itself int number of times
	 */
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
