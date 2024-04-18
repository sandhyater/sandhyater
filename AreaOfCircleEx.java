package scanner;

import java.util.Scanner;

public class AreaOfCircleEx {

	
			public static final double Pivalue=3.14;
			public static void main(String[] args) 
			{

			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the radius");

			double r=s1.nextDouble();

			double areaofcircle=Pivalue*r*r;
			System.out.println("The area of circle is:"+areaofcircle);



		
			}
	
	}


