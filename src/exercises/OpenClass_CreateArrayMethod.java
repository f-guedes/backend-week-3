package exercises;

import java.util.Scanner;

public class OpenClass_CreateArrayMethod {

	static int[] createArray(int a, int b, int c, int d, int e) {
		// Provide inline hints or outlines for your students
		int[] arr = {a, b, c, d, e};
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		int[] mainArray = createArray(a, b, c, d, e);
		System.out.println("The third number in your array is: " + mainArray[2]);
	}
}