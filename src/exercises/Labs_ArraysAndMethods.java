package exercises;

public class Labs_ArraysAndMethods {
	
	public static void main(String[] args) {
		
		//create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arr = {1, 5, 2, 8, 13, 6};
						
		//print out the first element in the array
		System.out.println(arr[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(arr[arr.length -1]);
		
		//print out the element in the array at position 6. what happens?
		//System.out.println(arr[6]);
		
		//print out the element in the array at position -1. what happens?
		//System.out.println(arr[-1]);
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//write an enhanced for loop that prints out each element in the array
   		 for (int element : arr) {
   			 System.out.println(element);
   		 }
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
   		 double sum = 0;
   		 for (int i = 0; i < arr.length; i++) {
   			 sum += arr[i];
   		 }
   		 System.out.println(sum);
   		 
   		 					//or you can use an enhanced for loop (for each loop):
   		sum = 0;
   		for (int element : arr) {
   			sum += element;
   		}
		System.out.println(sum);
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / arr.length;
		System.out.printf("%.2f%n", average);
			
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int element : arr) {
  			 if (element % 2 != 0) {
  				 System.out.println(element);
  			 }
  		 }
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", " Sally", "Thomas", "Robert"};
				
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println("There are " + sumOfLetters + " characters total in " + names[0] + "," + names[1] + ", " + names[2] + " and " + names[3] + ".");
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("John");
		greet("Patrick");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		String greeting = greet2 ("Nick");
		System.out.println(greeting);
		
		//analyze the difference between these two methods - what do you find? How are they different?

		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(isStringGreater ("Inexplicably", 11));
		
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		
		System.out.println(stringExists(names, "Sam"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array

		//write and test a method that takes an array of double and returns the average

		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the string at that position

		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
		//even amount of letters is greater than the sum of those with an odd amount of letters.

		
		//write and test a method that takes a string and returns true if the string is a palindrome

		
	}
	
	public static void greet (String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public static String greet2 (String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean isStringGreater (String testString, int number) {
		return testString.length() > number;
	}
	
	public static boolean stringExists (String[] arr, String x) {
		for (String line : arr) {
			if (line.equals(arr)) {
				return true;
			} 
		}	return false;
	} 
	
	
	
}	
	