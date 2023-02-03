package list;

class ArrayListIterator<E> extends ArrayIterator<E> implements ListIterator<E> {

	private boolean forward = true;
	
	ArrayListIterator(List<E> list) {
		super(list);
	}
	
	ArrayListIterator(int startIndex, List<E> list) {
		super(list);
		index = startIndex - 1;
	}
	
	@Override
	public E next() {
		forward = true;
		return super.next();
	}
	
	public boolean hasPrevious() {
		return index > -1;
	}
	
	public E previous() {
		forward = false;
		return list.get(index--);
	}
	
	@Override
	public void remove() {
		if(forward) list.remove(--index);
		else list.remove(index + 1);
	}
	
	public void add(E value) {
		list.add(++index, value);
	}
}
