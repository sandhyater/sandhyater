package javabasics;

public class MethodCallingType {

	
	static void add()
	{
		System.out.println("Addition");
	}
	
	static void sub()
	{
		System.out.println("Subtraction");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
    static void div()
    {
	
    	System.out.println("Division");
    }
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Method");
add();
sub();
mul();
div();
	}

}
