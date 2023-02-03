package sort;
import list.*;

public class SelectionSort<E extends Comparable<E>> implements Sorter<E> {
	List<E> list;
	
	public void sort(List<E> list) {
		this.list = list;
		for(int i = 0; i < list.size() - 1; i++) {
			//swap(i, posSmallest(i));
			swap(i, posLargest(i));
		}
	}

	@SuppressWarnings("unused")
	private int posSmallest(int start) {
		int result = start;
		for(int i = start; i < list.size(); i++) {
			if(list.get(i).compareTo(list.get(result)) < 0) {
				result = i;
			}
		}
		return result;
	}
	
	private int posLargest(int start) {
		int result = start;
		for(int i = start; i < list.size(); i++) {
			if(list.get(i).compareTo(list.get(result)) > 0) {
				result = i;
			}
		}
		return result;
	}
	
	private void swap(int x, int y) {
		E temp = list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);
	}
}
