package logicaloperators;

public class LogicalOperators_Ex1 {

	public static void main(String[] args) {


		int age=29;
		 double salary=20000000;
		if(age>28&&salary<2000)
		{		{
			System.out.println("We cannot select for interview");
		
		}
		}
		else  if(age>28&&salary <= 2000)
		{
			System.out.println("We cannot select for interview in next tenure");

		}
		else  if(age<28 || salary <= 100)
		{
			System.out.println("We can select for interview in next tenure");

		}
		else  if(! (age>38 || salary <= 1000))
		{
			System.out.println("He can select for interview in next tenure");

		}


		else
		{ 
			System.out.println("He cannot attend interview");

	}
}
		}


