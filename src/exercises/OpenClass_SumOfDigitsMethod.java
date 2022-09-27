package exercises;

import java.util.*;

public class OpenClass_SumOfDigitsMethod {

	static int sumOfDigits(int digits) {
		// Write your code below 
        int result = digits;
        int sum = 0;
        while (result > 0) {
            sum = sum + result % 10;
            result = result / 10;
        }
  		return sum; 
}
			
		
		
	

    // Do not change the code below this line 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int digits = in.nextInt();
		int sumAll = sumOfDigits(digits);
		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll);
	}
}