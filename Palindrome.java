package stringprograms;

public class Palindrome {

	public static void main(String[] args) {

		String input="mom";
		String output=" ";
		for(int i=input.length()-1;i>=0;i--)
		{
			char a1=input.charAt(i);
			output=output+a1;

		}
		
	
		System.out.println(output);
if(input.equals(output))
{
	System.out.println("Plaindrome");
}
	else
	{
		System.out.println("Not Palindrome");

}
}
}