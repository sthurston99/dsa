package queue;
import list.*;

public class Queue<E> implements QueueADT<E> {
	List<E> list = new LinkedList<E>();
	
	public void add(E value) {list.add(value);}
	public E remove() {return list.remove(0);}
	public E peek() {return list.get(0);};
	public boolean isEmpty() { return list.isEmpty(); }
	public void clear() { list.clear(); }
	public int size() { return list.size(); }
	public String toString() {return list.toString(); }
}