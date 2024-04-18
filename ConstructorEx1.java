package constructors;

public class ConstructorEx1 {


	public  ConstructorEx1(int a)
		{
			System.out.println("The value in first method is"+a);
			}
	public  ConstructorEx1(double b)
		{
			System.out.println("The value in second method is:"+b);
			}
	public  ConstructorEx1(float c)
		{
			System.out.println("The value in third method is:"+ c);
			}
	public  ConstructorEx1(boolean d)
		{
			System.out.println("The value in fourth method is:"+d);
			}
		public ConstructorEx1(String s)
		{
			System.out.println("The value in fifth method is:"+s);
			}

			public static void main(String[] args)
		{
			
			new ConstructorEx1(5);
			new ConstructorEx1(6.5);
			new ConstructorEx1(5F);
			new ConstructorEx1(true);
			new ConstructorEx1("Sandhya");
			

		}


	

	}


