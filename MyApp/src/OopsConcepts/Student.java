package OopsConcepts;

public class Student {

	int sid;
	String studentName;
	char grade;
	
	
	Student(int id, String name, char g) {
		sid=id;
		studentName= name;
		grade = g;
	}
	void getValues(int id, String name, char g) {
		sid=id;
		studentName= name;
		grade = g;
		
		
		
	}
	void display() {
		System.out.println(sid+" "+studentName+""+" "+grade);		
	}
}
