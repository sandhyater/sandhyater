package arrayprograms;
import java.util.ArrayList;
public class ArrayList_Ex1 {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add("Sandhya");
		a1.add("shuthika");
		a1.add("water");
		a1.remove("water");
		System.out.println(a1);

		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("Sadnhya"));
		a1.clear();
		ArrayList a2=new ArrayList();
		a1.addAll(a1);
		a2.add("shravan");
		a2.add("shuthika1");
		a1.removeAll(a1);

		System.out.println(a2);
		System.out.println(a2.containsAll(a1));


	}

}
