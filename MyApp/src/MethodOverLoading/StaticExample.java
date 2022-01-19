package MethodOverLoading;

public class StaticExample {

	static int a = 12; // Static variable //
	 int b = 20; // Non static variable //

	static void m1() // Static method
	{

		System.out.println(" This is a static method!");
	}

	void m2() // Non-static method //
	{
		System.out.println("This ain't a static method!");
	}

	public static void main(String[] args) {
System.out.println(a);
m1();
// m2(); // This statement is incorrect because the b is non static method. //
// System.out.println(b); //  This statement is incorrect because the b is non static variable. //	

// Static methods can also access non static stuff via Object creation//
StaticExample se = new StaticExample();
System.out.println(se.b);
se.m2();
	}

}
