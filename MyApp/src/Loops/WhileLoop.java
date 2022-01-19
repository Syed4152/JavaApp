package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		/* Printing number 1 to 10 //
		 * 
		 */
   int i=1; 
		while (i<=10) {
			System.out.println(i);
			i+=1;
		}
		
		
		/* Printing even numbers between 1 to 10
		 * 
		 * 
		 */
		
		 i =2;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		/*
		 * Printing odd numbers in ascending order.
		 */
		
		i=1;
		while (i<=10) {
			System.out.println(i);
			i+=2;	
		}
		
		/*
		 * Printing numbers in descending order 10 to 1
		 */
		
		int t=200; // Initialization//
		while(t>=0) // Condition //
			{
			System.out.println(t);  
			t-=1; // Decrement //
		}
	}
	
}


