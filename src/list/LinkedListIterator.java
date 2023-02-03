package list;

class LinkedListIterator<E> extends LinkedIterator<E> implements ListIterator<E> {
	
	private boolean forward = true;
	
	LinkedListIterator(LinkedList<E> list) {
		super(list);
	}
	
	LinkedListIterator(int startIndex, LinkedList<E> list) {
		super(list);
		for(int i = 0; i < startIndex; i++) ref = ref.next;
	}
	
	public boolean hasNext() {
		if(list.isEmpty()) return false;
		return super.hasNext();
	}
	
	public E next() {
		if(forward) ref = ref.next;
		forward = true;
		return ref.value;
	}
	
	public boolean hasPrevious() {
		if(list.isEmpty()) return false;
		return ref.prev != list.head;
	}
	
	public E previous() {
		if(!forward) ref = ref.prev;
		forward = false;
		return ref.value;
	}
	
	public void remove() {
		super.remove();
		if(!forward) ref = ref.next;
	}
	
	public void add(E value) {
		if(forward) {
			ref = ref.next;
		} else {
			forward = true;
		}
		Node<E> temp = new Node<E>(value, ref, ref.prev);
		ref.prev.next = temp;
		ref.prev = temp;
		list.size++;
		ref = ref.prev;
	}
}
