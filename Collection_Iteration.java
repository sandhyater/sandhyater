package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Collection_Iteration {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add(8765);		
		a1.add(321);
		a1.add("Sandhya");

	a1.add("shruthika");
		a1.add("shravan");
		Iterator i1=a1.iterator();
while(i1.hasNext()==true)
{
	System.out.println(i1.next());
	}
ListIterator i2=a1.listIterator();
while(i2.hasNext()==true)
{
	System.out.println(i2.next());
	}
System.out.println("-------------------");

while(i2.hasPrevious()==true)
{
	System.out.println(i2.previous());
	}

	}

}
