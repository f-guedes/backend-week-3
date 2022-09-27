package exercises;

import java.util.Scanner;

public class OpenClass_ReturnSumMethod {
		
		
	    // method to sum 3 integers 

		static int returnSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
		}

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		System.out.println(returnSum(num1, num2, num3));
	}
	
}
	
	

