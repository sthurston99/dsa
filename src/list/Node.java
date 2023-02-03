package list;

/**
 * Stores a value in a list
 * @author Simon Thurston
 */

class Node<E> {
	E value;
	Node<E> next;
	Node<E> prev;
	
	Node(E value, Node<E> next, Node<E> prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
}
