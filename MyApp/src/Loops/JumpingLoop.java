package Loops;

public class JumpingLoop {

	public static void main(String[] args) {
		
for(int i=1; i<=10; i+=1) {
	
	if (i==5 || i==7 || i==9) {
		continue; // Skipped number's 5, 7, and 9 //
	}
	System.out.println(i);
}

for(int i=1; i<=10; i+=1) {
	
	if (i==6) {
		break; // Broken at number 6 //
	}
	System.out.println(i);
}
	}

}
