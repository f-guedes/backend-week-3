package exercises;

import java.util.Scanner;

public class OpenClass_RepeatWordMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numTimes;
		String userWord;
		userWord = in.nextLine();
		numTimes = in.nextInt();
		System.out.println(repeatWord(userWord,numTimes));
	}

	
	static String repeatWord(String userWord, int numTimes) {
		// Write your code in here 
		String longWord = "";
		for (int i = 0; numTimes > 0; i++) {
		    longWord += userWord;
		    numTimes--;
		}
		return longWord;
		
		
		
	}

}
