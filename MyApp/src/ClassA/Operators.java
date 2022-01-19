package ClassA;

public class Operators {

	
	public static void main(String[]args){
		// Arithmetic operators operations.//
		
		int a= 45;
		int b=55;
		
		int c =a+b;
		System.out.println("These are the Arithmetic operators");
		System.out.println("This is a arithematic opreation:" + (a+b));
		System.out.println("This is a arithematic opreation:" + (a%b));
		
		
		// Comparison Operators.// 
		System.out.println("These are the Comparison Operators.");
		System.out.println("This is a arithematic opreation:" + (a==b));//False
		System.out.println("This is a arithematic opreation:" + (a>b));//False
		System.out.println("This is a arithematic opreation:" + (a<b));//True
		System.out.println("This is a arithematic opreation:" + (a>=b));//False
		System.out.println("This is a arithematic opreation:" + (a<=b));//True
		System.out.println("This is a arithematic opreation:" + (a!=b));//True
		
		// Logical Operators.//
		
		boolean t= true;
		boolean s= false;
		System.out.println("The below are the logical operators......");
		System.out.println(t && s); //False
		System.out.println(t || s); // True
		System.out.println(!s); // true
		System.out.println(!t  );//false
		
		// Increment operators.//
		
	a=12;
	
	//a= a+1;//
	a++; // or a= a+1; // 
	System.out.println(a);
		b=10;
		 //b=b-1;//   
		b--;
		System.out.println(b);
		
		
		
		
	}
	}


