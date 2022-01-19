package MethodOverLoading;

public class OverLoadMainMethod {

	public void main(int x) {

		System.out.println(x);
	}

	public void main(int x, int y) {

		System.out.println(x + y);
	}

	public static void main(String[] args) {
		OverLoadMainMethod lm = new OverLoadMainMethod();
		lm.main(1);
		lm.main(12, 211);
	}

}