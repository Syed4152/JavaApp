package MethodOverLoading;

public class ThisKeyWord {
	int a, b; // Instance Variables or class variables

	void addValues(int a, int b) // Method Variables/Externals Variables//
	{

		this.a = a;
		this.b = b;
	}

	void printValues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyWord th = new ThisKeyWord();
		th.addValues(12, 2);
		th.printValues();

	}

}
