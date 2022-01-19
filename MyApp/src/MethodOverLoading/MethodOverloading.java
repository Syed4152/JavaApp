package MethodOverLoading;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println(a+b);
		
	}
	void add(int a, double b) {
		System.out.println(a+b);
		
	}
	void add(double a, double b) {
		System.out.println(a+b);
		
	}
	void add(int a, int b, int c) {
		System.out.println(a+b-c);
		
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(1, 2); // First Method //
		mo.add(12, 12.22); // Second Method //
		mo.add(12.2, 22.2); // Third Method //
		mo.add(12, 2, 2); // Fourth method // 
		
		
	}

}
