package stringprograms;

public class StringEx1 {

	public static void main(String[] args) {

		String name="    Sandhya";
		int size=name.length();
		System.out.println(size);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('s'));
		System.out.println(name.equals("Sandhya"));
		System.out.println(name.contains("sandhya"));
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,6));
		System.out.println(name.concat("  shruthika"));
		System.out.println(name.trim());
		String name2="shruthika";
		String name1=" ";
		System.out.println(name2.replace('r','r'));
		String n="shravan";
		System.out.println(n);

		System.out.println(n.replaceAll("shravan", "SandY"));

		String a="Milk2365";
		System.out.println(a.replaceAll("[a-z]", " "));
		System.out.println(a.replaceAll("[A-Z]", " "));
		System.out.println(a.replaceAll("[0-9]","692"));
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf('k'));
		System.out.println(a.equalsIgnoreCase("Milk2365"));
		System.out.println(n.repeat(5));
		String s1="father";
		System.out.println(s1.toCharArray());








	}

}
