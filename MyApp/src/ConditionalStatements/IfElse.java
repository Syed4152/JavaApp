package ConditionalStatements;

public class IfElse {

	public static void main(String[] args) {

		int age = 58;

		if (age >= 18) {

			System.out.println("This person is eligble for voting.");
		} else {
			System.out.println("This person is not eligible for voting.");
		}

		// Finding out whether the number is even or odd.//

		int num = 2;

		if (num % 2 == 0) {
			System.out.println("Its an even number");
		} else {

			System.out.println("The num is not ant an even and its an odd number");
		}

		// For an example there are two numbers and I need find which is the largest
		// one.
		int a = 2;
		int b = 11;

		if (a > b) {

			System.out.println("a is large");

		} else if (a>b){
			System.out.println("Its NOT!");
		}
		else if (a<b){
			System.out.println("It is!");
		} else {System.out.println("Hey Drac!");}
	}

}
