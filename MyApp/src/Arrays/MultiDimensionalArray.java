package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int age[][] = new int[3][2];
		
		// Three rows and two columns.//
		
		
		age[0][0]= 100;
		age[0][1]=200;
		
		age[1][0]= 300;
		age[1][1]=400;
		
		age[2][0]=500;
		age[2][1]=600;
		
		int age1[][] = {{101,102},{201,203}, {122,333}, {344,5555}};
		System.out.println("Number of rows " + age1.length);
		System.out.println("Number of colcumns " + age1[0].length);
		 
		for (int i =0; i<age1.length; i++){
			
			for(int j=0; j<age1[0].length; j++) {
				
				System.out.println(age1[i][j]);
			}
		}
		
		// Or //
		
		for(int t[]:age1) {
			for(int i:t) {
				System.out.println(i);
				
			}
		}
}
	}