package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OpenClass_PasswordCheckerMethod {

	static boolean passwordChecker(String password) {
		// Write your code below this line 
		if (password.length() >= 8 &&
				(password.contains("!") ||
			     password.contains("$") ||
			     password.contains("%") || 
			     password.contains("&"))) {
			         return true;
			     }
			return false;
	}	
				
	
    
    // Do not change the code below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String password = in.nextLine();
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
	}
}