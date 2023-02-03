package sort;
import list.*;

public interface Sorter<E extends Comparable<E>> {
	void sort(List<E> list);
}
