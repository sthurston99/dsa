package queue;

public interface QueueADT<E> {
	void add(E value);
	E remove();
	E peek();
	boolean isEmpty();
	void clear();
	int size();
}