package list;

class LinkedIterator<E> implements Iterator<E> {

	LinkedList<E> list;
	Node<E> ref;
	
	LinkedIterator(LinkedList<E> list) {
		this.list = list;
		this.ref = list.head;
	}
	
	public boolean hasNext() {
		return ref.next != list.tail;
	}
	
	public E next() {
		ref = ref.next;
		return ref.value;
	}
	
	public void remove() {
		ref.next.prev = ref.prev;
		ref.prev.next = ref.next;
		list.size--;
		ref = ref.prev;
	}
	
	public boolean has2more() {
		return (ref.next.next != list.tail) && hasNext();
	}
	
}
