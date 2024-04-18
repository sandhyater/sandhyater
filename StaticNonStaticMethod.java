package staticmethods;


public class StaticNonStaticMethod {
	public static void method1()
	{
		System.out.println("This is static method 1");
		}
	public static void method2()
	{
		System.out.println("This is static method 2");
		}
	public static void method3()
	{
		System.out.println("This is static method 3");
		}
	public static void method4()
	{
		System.out.println("This is static method 4");
		}
	public static void method5()
	{
		System.out.println("This is static method 5");
		}

void method6()
{
System.out.println("This is non-static method 6");
}
void method7()
{
System.out.println("This is non-static method 7");
}
void method8()
{
System.out.println("This is non- static method 8");

}
void method9()
{
System.out.println("This is non-static method 9");
}
void method10()
{
System.out.println("This is non-static method 10");
}
	public static void main(String[] args)
	{
		method1();
		method2();
		method3();
		method4();
		method4();
		StaticNonStaticMethod s1=new StaticNonStaticMethod();
		s1.method6();
		s1.method7();
		s1.method8();
		s1.method9();
		s1.method10();

	}


}
