package listDriver;
import list.*;

public class Quiz2Tester {

	public static void main (String [] args) {
		List<String> list = new LinkedList<String>();
		list.add("billy"); // true, true
		list.add("jimmy"); // true, true
		list.add("lilly"); // true, true
		list.add("kimmy"); // true, true
		list.add("lilly"); // true, true
		list.add("bimmy"); // true, true
		list.add("limmy"); // true, true
		list.add("billy"); // true, false
		list.add("limmy"); // false, false
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Current value: " + it.next()
								+ "\nHas next: " + it.hasNext()
								+ "\nHas Two More: " + it.has2more());
		}
	}
}
