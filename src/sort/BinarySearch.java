package sort;
import list.*;

public class BinarySearch<E extends Comparable<E>> {
	List<E> list;
	E target;
	
	public BinarySearch(List<E> list) {
		this.list = list;
		
	}
	
	public int search(E target) {
		this.target = target;
		return binarySearch(0, list.size() - 1);
	}
	
	private int binarySearch(int start, int end) {
		if(start > end) return -1;
		int mid = (start + end) / 2;
		int comparison = target.compareTo(list.get(mid));
		if(comparison == 0) return mid;
		if(comparison < 0) return binarySearch(start, mid - 1);
		return binarySearch(mid + 1, end);
	}
}
