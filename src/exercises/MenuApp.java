package exercises;

import java.util.Scanner;

public class MenuApp {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	
	
	public static void main(String[] args) {
		
		String[] team = new String[5];
		
		int decision = 0;
		
		while (decision != 6) {
			showMenu();
			decision = s.nextInt();
			
		if (decision < 1 || decision > 6) {
			System.out.println("Please make a valid selection");
		} else if (decision == 1) {
			showTeam(team);
		} else if (decision == 2) {
			showTeamMember(team);
		} else if (decision == 3) {
			addTeamMember(team);
		} else if (decision == 4) {
			deleteTeamMember(team);
		} else if (decision == 5) {
			deleteAllTeamMembers(team);
		} else if (decision == 6) {
			System.out.println();
		}
		}
		
	}

	public static void showTeam (String[] team) {
		System.out.println("Team: ");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + " : " + team[i]);
		}
	}
	
	public static void showTeamMember(String[] team) {
		System.out.println("Which team member would you like to see? ");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + " : " + team[teamNumber]);
		}
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
		team[addingIndex++] = newMember;
		}
	}
	
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}
	}

	public static void deleteAllTeamMembers(String[] team) {
		System.out.println("Would you like to delete all team members? Type (y) or (n)");
		String yes1 = "Y";
		String yes2 = "y";
		if (s.nextLine().equals(yes1) || s.nextLine().equals(yes2)) {
			System.out.println("All team members have been deleted.");
			for (int i = 0; i < team.length; i++) {
				team[i] = null;
			}
		} else {
				System.out.println("No changes have been made.");
		}
	}
	
//	public static boolean yesOrNo (String input) {
//		String yes1 = "Y";
//		String yes2 = "y";
//		if (s.nextLine() == yes1 || s.nextLine() == yes2) {
//			return true;
//		} else {
//			return false;
//		}
//	}
		
	public static boolean isValid (int input) {
		if (input >= 0 && input <= 4) {
			return true;
		} else {
			System.out.println("Invalid entry.");
			return false;
		}
	}

	public static void showMenu() {
		System.out.println("Please type a number from the options below or 6 to exit:");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add A Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Members");
		System.out.println("6) Exit");
	}

}
