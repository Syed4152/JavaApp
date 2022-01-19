package OopsConcepts;

public class Calculation {

	int x = 5;
	int y = 200;

	// Method does not take any parameters and also does not return any value.//
	/*
	 * void sum() { System.out.println(x + y); }
	 */

	// Method does not take any parameters but return something.//

	/*
	 * int sum() {
	 * 
	 * return (x + y); }
	 */

	// Taking parameters but not returning any values.//

	/*
	 * void sum(int x,int y) {
	 * 
	 * System.out.println(x+y); }
	 */

	// Method takes parameter and also returns a value.//

	int sum(int x, int y) {

		return x + y;
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		// System.out.println(cal.sum(45, 23)); Case2
		// cal.sum(120, 45); Case3
		// System.out.println(cal.sum(4, 233)); Case4

	}

}
