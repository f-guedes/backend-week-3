package exercises;

public class FormatSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bob";
		int age = 32;
		double money = 58.0300003;
		
		System.out.printf("Hi! My name is %s. I am %d years old."
				+ " I have, $%.2f money in my wallet. %n", name, age, money);
		
		String dollars = String.format("%.2f", money);
		System.out.print("Hi! My name is " + name + ".");
		System.out.print(" I'm " + age + " years old.");
		System.out.println(" I have " + money + " in my wallet.");
	}

}
