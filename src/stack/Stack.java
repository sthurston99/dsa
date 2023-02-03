package stack;
import list.*;

public class Stack<E> implements StackADT<E> {
	
	List<E> list = new LinkedList<E>();
	
	public Stack() {}
	public Stack(boolean isArray) { if(isArray) list = new ArrayList<E>(); }
	
	public E push(E value) { list.add(value); return value; }
	public E pop() { return list.remove(list.size() - 1); }
	public E peek() { return list.get(list.size() - 1); }
	public boolean isEmpty() { return list.isEmpty();}
	public void clear() { list.clear(); }
	public int size() { return list.size(); }
}