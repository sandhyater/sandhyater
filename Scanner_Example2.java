package javabasics;
import java.util.Scanner;


public class Scanner_Example2 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the First number");
int a=s1.nextInt();
System.out.println("Enter the Second number");

int b=s1.nextInt();


int c=a+b;
System.out.println("The addition of two number is "+ c);



	}

}
