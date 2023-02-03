package tree;

public class EBST<E extends Comparable<E>> implements BT<E> {
	public boolean containsKey(Object obj) { return false; }
	public E get(E value) { return null; }
	public E getValue() { return null; }
	public BT<E> add(E value) {
		BST.added = true;
		return new BST<E>(value);
	}
	public void setValue(E value) {}
	public void setLeft(BT<E> tree) {}
	public void setRight(BT<E> tree) {}
	public int size() { return 0; }
}
