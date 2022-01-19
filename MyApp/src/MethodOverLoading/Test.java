package MethodOverLoading;
interface Z

{
	int a= 12;
	void m1();
}


public class Test implements Z
{ 
	public void m1() 
	{
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();

	}

}
