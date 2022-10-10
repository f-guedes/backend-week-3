package exercises;

import java.util.*;

public class OpenClass_StringToArrayOfCharacters {

	static char[] wordToArray(String userWord) {
	    char[] arr = new char[userWord.length()];
	    for (int i = 0; i < userWord.length(); i++) {
	    	arr[i] = userWord.charAt(i);
		}
	    return arr;
	}

	
	
    //Do not change the code below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userWord;;
		userWord = in.nextLine();
		
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(wordToArray(userWord)));

	}
}