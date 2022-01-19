package OopsConcepts;

public class MainEmployeeClass {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.employId = 1254;
		emp1.empName = "Syed";
		emp1.sal = 12555.14;
		emp1.depNumber = 1;
		emp1.job = "Software Engineer";
		emp1.display();	
		
		Employee emp2 = new Employee();
		
		emp2.employId = 1253;
		emp2.empName = "Tamim";
		emp2.sal = 1255.5;
		emp2.depNumber = 2;
		emp2.job = "Manager";
		emp2.display();	
	}

}
