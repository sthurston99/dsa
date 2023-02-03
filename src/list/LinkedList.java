package list;

/**
 * List made using references.
 * @author Simon Thurston
 */

public class LinkedList<E> implements List<E> {
	int size = 0;
	Node<E> head = new Node<E>(null, null, null);
	Node<E> tail = new Node<E>(null, null, head);

	public LinkedList() {
		head.next = tail;
	}

	private Node<E> setRef(int index) {	
		Node<E> ref = null;
		if(index > size/2) {
			ref = tail.prev;
			for(int i = size - 1; i > index; i--) {
				ref = ref.prev;
			}
			
		} else {
			ref = head.next;
			for(int i = 0; i < index; i++) {
				ref = ref.next;
			}
		}
		return ref;
	}
	
	public void add(E value) {
		Node<E> temp = new Node<E>(value, tail, tail.prev);
		temp.prev.next = temp;
		tail.prev = temp;
		size++;
	}

	public void add(int index, E value) {
		Node<E> ref = setRef(index);	
		Node<E> temp = new Node<E>(value, ref, ref.prev);
		ref.prev.next = temp;
		ref.prev = temp;
		size++;
	}

	public E remove(int index) {
		Node<E> ref = setRef(index);
		ref.prev.next = ref.next;
		ref.next.prev = ref.prev;
		size--;
		return ref.value;
	}
	
	public boolean remove(Object obj) {
		Node<E> ref = head.next;
		for(int i = 0; i < size; i++) {
			if(ref.value.equals(obj)) {
				ref.prev.next = ref.next;
				ref.next.prev = ref.prev;
				size--;
				return true;
			}
			ref = ref.next;
		}
		return false;
	}

	public E get(int index) {
		Node<E> ref = setRef(index);
		return ref.value;
	}

	public E set(int index, E value) {
		Node<E> ref = setRef(index);
		E old = ref.value;
		ref.value = value;
		return old;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		head.next = tail;
		tail.prev = head;
		size = 0;
	}

	public int indexOf(Object obj) {
		Node<E> ref = head.next;
		for(int i = 0; i < size; i++) {
			if(ref.value.equals(obj)) {
				return i;
			}
			ref = ref.next;
		}
		return -1;
	}
	
	public int indexOfLast(Object obj) {
		Node<E> ref = tail.prev;
		for(int i = size - 1; i > 0; i--) {
			if(ref.value.equals(obj)) {
				return i;
			}
			ref = ref.prev;
		}
		return -1;
	}
	
	public String toString() {
		if(this.isEmpty()) {
			return "[]";
		} else {
			Node<E> ref = setRef(0);
			String out = "[" + ref.value;
			ref = ref.next;
			for(int i = 0; i < this.size() - 1; i++) {
				out = out.concat("," + ref.value);
				ref = ref.next;
			}
			out = out.concat("]");
			return out;
		}
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if(obj instanceof List<?>) {
			List<E> list = (List<E>) obj;
			if(this.size() != list.size()) {
				return false;
			}
			Iterator<E> it = this.iterator();
			Iterator<E> that = list.iterator();
			while(it.hasNext() && that.hasNext()) {
				if(!it.next().equals(that.next())) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public Iterator<E> iterator() {
		return new LinkedIterator<E>(this);
	}
	
	public ListIterator<E> listIterator() {
		return new LinkedListIterator<E>(this);
	}
	
	public ListIterator<E> listIterator(int startIndex) {
		return new LinkedListIterator<E>(startIndex, this);
	}
}
