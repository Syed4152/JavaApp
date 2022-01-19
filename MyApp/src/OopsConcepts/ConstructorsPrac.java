package OopsConcepts;

public class ConstructorsPrac {

	int x;
	int y;
	
	 /* ConstructorsPrac() // Default Constructor.// 
	{ 
		x= 100;
		y= 122;		
	} */
	
	ConstructorsPrac(int a, int b) // Default Constructor.// 
	{ 
		x= a;
		y= b;		
	}
	void disPlay() {
		System.out.println(x*y);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// ConstructorsPrac cm = new ConstructorsPrac(122, 222); // Parametirized constructor.// 
		ConstructorsPrac cm = new ConstructorsPrac(122, 222); // Default Constructor.// 
		cm.disPlay();
		

	}

}
