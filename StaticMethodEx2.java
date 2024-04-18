package staticmethods;

public class StaticMethodEx2 {

	
		public static void add(int a,int b)
		{
		int sum=a+b;
		System.out.println("The addition of two number is :" +sum);
		}
		public static void subtract(int a,int b)
		{
		
		int sub=a-b;
		System.out.println("The subtraction of two number is :" +sub);


	}
		public static void multiply(int a,int b)
		{
		
		int mul=a*b;
		System.out.println("The multiplicaton of two number is :" +mul);


	}
		public static void divide(int a,int b)
		{
			
		int div=a*b;
		System.out.println("The division of two number is :" +div);


	}
		public static void main(String[] args)
		{
			add(2,30);
			subtract(1,6);
			multiply(8,9);			
			divide(12,10);

			

			}

}