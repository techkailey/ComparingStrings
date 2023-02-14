import java.util.ArrayList;

public class Main{
	public static String s1 = "Alpha";
	public static String s2 = "delta";
	public static String s3 = "omega";
	public static String s4 = "aplha";

	public static void main(String[] args){
		ArrayList<String> array = new ArrayList<String>();
		array.add("Kailey");
		array.add("Bag");
		array.add("kleo");
		array.add("kilo");

		System.out.println(Recursion.compare(s1,s2));
		System.out.println(Recursion.compare(s3,s1));
		System.out.println(Recursion.compare(s4,s1));
		System.out.println(Recursion.compare(s2,s3));
		System.out.println(Recursion.compare(s1,s1));

		System.out.println(Recursion.findMinimum(array));
	}
}