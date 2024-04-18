package collection;
import java.util.Set;
import java.util.TreeSet;

public class CollectionClassSet {

	public static void main(String[] args) {

		Set s1=new TreeSet();
		s1.add(1234);
		s1.add(765);
		s1.add(9876);
        s1.add(981);
        s1.add(22);
        s1.add(22);
        s1.add(22);//it doesnot support duplicates
        s1.add(null);

		s1.add(45);//hashcode value
		System.out.println(s1);

	}

}
