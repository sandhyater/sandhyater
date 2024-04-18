package scanner;
import java.util.Scanner;
public class AreaofCircleScanner {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=s1.nextDouble();;
		double areaofcircle=Math.PI*r*r;
System.out.println("The area of circle is :"+ areaofcircle);

	

}
}