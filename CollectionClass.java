package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionClass {

	public static void main(String[] args) 
	
	{
List l1=new ArrayList();
l1.add(1234);
l1.add(762);
l1.add(832);
l1.add(25);
l1.add(25);
l1.add(11);
//l1.add(null);
//l1.add(null);
//l1.add(null);
l1.add(12);
l1.add(12);//duplicates  you can add it many times
Collections.sort(l1);
System.out.println(l1);

	}

}
