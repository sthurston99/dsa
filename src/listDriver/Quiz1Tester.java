package listDriver;
import list.*;

public class Quiz1Tester {

	public static void main (String [] args) {
		List<String> list = new LinkedList<String>();
		list.add("billy");
		list.add("jimmy");
		list.add("lilly");
		list.add("kimmy");
		list.add("lilly");
		list.add("bimmy");
		list.add("limmy");
		list.add("billy");
		list.add("limmy");
		System.out.println(list.indexOfLast("lilly"));
		System.out.println(list.indexOfLast("billy"));
		System.out.println(list.indexOfLast("limmy"));
		System.out.println(list.indexOfLast("jimmy"));
		System.out.println(list.indexOfLast("timmy"));
		System.out.println(list.indexOfLast(null));
		System.out.println(list.indexOfLast(""));
	}
}
