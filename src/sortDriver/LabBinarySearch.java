package sortDriver;
import sort.*;
import list.*;

public class LabBinarySearch {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("al");
		names.add("alan");
		names.add("bob");
		names.add("bob");
		names.add("jim");
		names.add("jimmy");
		names.add("mike");
		names.add("sue");
		names.add("tom");
		
		Sorter<String> sorter = new BubbleSort();
		
		sorter.sort(names);
		
		BinarySearch<String> searcher = new BinarySearch(names);
		
		System.out.println("jim");
		searcher.search("jim");
		System.out.println("bob");
		searcher.search("bob");
		System.out.println("tom");
		searcher.search("tom");
		System.out.println("susie");
		searcher.search("susie");
		System.out.println("abbie");
		System.out.println(searcher.search("abbie"));
	}
}
