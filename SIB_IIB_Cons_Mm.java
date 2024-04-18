package javabasics;

public class SIB_IIB_Cons_Mm {
	static {
		System.out.println("I am SIB");
		
	}
	{
	System.out.println("I am IIB");
	}
	SIB_IIB_Cons_Mm()
	{
		System.out.println("I am CONSTRUCTOR");

	}
	public static void main(String[] args) 
	{
		
		System.out.println("I am Main Method");
		SIB_IIB_Cons_Mm s1=new SIB_IIB_Cons_Mm();

		
	}

}
