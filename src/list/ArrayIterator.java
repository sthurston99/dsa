package list;

class ArrayIterator<E> implements Iterator<E> {

	List<E> list;
	/**
	 * Position of last accessed value.
	 */
	int index = -1;
	
	ArrayIterator(List<E> list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		return index < list.size() - 1;
	}
	
	public E next() {
		return list.get(++index);
	}
	
	public void remove() {
		list.remove(index--);
	}
	
	public boolean has2more() {
		return index < list.size() - 2;
	}
}
