package javabasics;
import java.util.Scanner;

public class Scanner_Allmethods {
			
		public static void main(String[] args)
		{
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Enter the age");
			Byte age=s1.nextByte();
			
			System.out.println("Enter the short number");
			short number=s1.nextShort();
			
			System.out.println("Enter the  number");
			int number1=s1.nextInt();
			
			System.out.println("Enter the longer number");
			long number2=s1.nextLong();
			
			System.out.println("Enter the Float number");
			
			float number3=s1.nextFloat();
			System.out.println("Enter the double number");
			
			double number4=s1.nextDouble();
			System.out.println("Enter the String");
			
			String name=s1.next();


s1.close();
		}

	}



