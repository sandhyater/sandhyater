package forloop;
import java.util.Scanner;

public class For_Areaofcircle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius=s1.nextDouble();
		double area=Math.PI*Math.pow(radius,2);
		System.out.println("The area of circle with radius" +radius + " is : " +area);
		s1.close();

	}

}
