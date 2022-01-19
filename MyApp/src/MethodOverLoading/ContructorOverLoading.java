package MethodOverLoading;

public class ContructorOverLoading {

	ContructorOverLoading(int a , int b){
		System.out.println(a+b);
		
	}
	
	ContructorOverLoading(int a , double b){
		System.out.println(a+b);
		
	}
	ContructorOverLoading(double a , double b){
		System.out.println(a+b);
		
	}
	ContructorOverLoading(int a , int b, int c){
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {

		ContructorOverLoading co = new ContructorOverLoading(12, 23.3);
		
		
		
		
		
	}

}
