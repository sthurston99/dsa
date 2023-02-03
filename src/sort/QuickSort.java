package sort;
import list.*;

public class QuickSort<E extends Comparable<E>> implements Sorter<E> {
	List<E> list;
	
	public void sort(List<E> list) {
		this.list = list;
		qSort(0, list.size() - 1);
	}
	
	private void qSort(int start, int end) {
		if(end - start < 1) return;
		int p = partition(start, end);
		qSort(start, p-1);
		qSort(p+1, end);
	}
	
	private int partition(int start, int end) {
		int p = start;
		E pivot = list.get(p);
		for(int i = start + 1; i <= end; i++) {
			if(pivot.compareTo(list.get(i)) > 0) {
				list.set(p,  list.get(i));
				p++;
				list.set(i,  list.get(p));
			}
		}
		list.set(p, pivot);
		return p;
	}
}
