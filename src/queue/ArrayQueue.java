package queue;
import list.*;
public class ArrayQueue<E> implements QueueADT<E> {
	
	List<E> list = new ArrayList<E>();
	int front = 0, back = 0, size = 0;
	
	public void add(E value) {
		if(size == list.size()) {
			list.add(back, value);
			front = (front+1) % list.size();
		} else { list.set(back, value); }
			back = (back+1) % list.size();
			size++;
	}
	
	public E peek() {
		if(list.isEmpty()) { return null; }
		return list.get(0);
	}
	
	public E remove() {
		E result = list.get(front);
		front = (front+1) % list.size();
		size--;
		return result;
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public void clear() {
		list.clear();
		size = 0;
	}
	
	public int size() {
		return list.size();
	}
	
	public String toString() {
		if(this.isEmpty()) return "[]";
		String out = "[" + list.get(front);
		for(int i = front; i != back; i = (i+1)%list.size()) {
			out = out.concat("," + list.get(i));
		}
		return out + "]";
	}
}