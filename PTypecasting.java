package typecasting;

public class PTypecasting {

	public static void main(String[] args)
	{
		//we are writing below program to understand primitive type casting
		double weight=83;//implicit syntax widening
		System.out.println(weight);//converts one data type to another datatype from int to double
		double weight1=(double)83;//explicit syntax
		System.out.println(weight);
		int a1= (int)83.65 ;//explicit syntax for narrowing
		System.out.println(a1);
		double a=90.87;
		int b=(int)a;//narrowing 
		System.out.println(b);
		}

}
