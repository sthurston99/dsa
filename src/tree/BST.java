package tree;

public class BST<E extends Comparable<E>> implements BT<E>{
	E value;
	BT<E> left = new EBST<E>(), right = new EBST<E>();
	int size = 1;
	static boolean added = true;
	
	BST(E value) {
		this.value = value;
	}
	
	public E getValue() { return value; }
	
	public E get(E value) {
		int cmp = this.value.compareTo(value);
		if(cmp == 0) return this.value;
		if(cmp < 0) return right.get(value);
		return left.get(value);
	}

	@SuppressWarnings("unchecked")
	public boolean containsKey(Object obj) {
		try {
			E key = (E) obj;
			int cmp = value.compareTo(key);
			if(cmp == 0) return true;
			if(cmp < 0) return right.containsKey(key);
			return left.containsKey(key);
		} catch(ClassCastException e) {
			return false;
		}
	}
	
	public BT<E> add(E value) {
		added = false;
		return addHelper(value);
	}
	
	private BT<E> addHelper(E value) {
		int cmp = this.value.compareTo(value);
		if(cmp < 0) right = right.add(value);
		if(cmp > 0) left = left.add(value);
		if(added) size++;
		return this;
	}
	
	public void setLeft(BT<E> tree) {
		left = tree;
		size = left.size() + right.size() + 1;
	}
	
	public void setRight(BT<E> tree) {
		right = tree;
		size = left.size() + right.size() + 1;
	}
	
	public void setValue(E value) {
		this.value = value;
	}
	
	public int size() {
		return size;
	}
}
