package list;

/**
 * List made using an Array.
 * @author Simon Thurston
 */
public class ArrayList<E> implements List<E> {
	int size = 0;
	E[] values;
	
	@SuppressWarnings("unchecked")
	public ArrayList(int cap) {
		values = (E[]) new Object[cap];
	}
	
	public ArrayList() {
		this(10);
	}
	
	public E get(int index) {
		return values[index];
	}
	
	public E set(int index, E value) {
		E old = values[index];
		values[index] = value;
		return old;
	}
	
	@SuppressWarnings("unchecked")
	private void allocate() {
		E[] temp = (E[]) new Object[values.length * 2];
		for(int i = 0; i < size; i++) {
			temp[i] = values[i];
		}
		values = temp;
	}
	
	public void add(int index, E value) {
		if(size == values.length) {
			allocate();
		}
		for(int i = size; i > index; i--) {
			values[i] = values[i-1];
		}
		values[index] = value;
		size++;
	}
	
	public void add(E value) {
		add(size, value);
	}
	
	public E remove(int index) {
		E old = values[index];
		for(int i = index; i < size-1; i++) {
			values[i] = values[i+1];
		}
		size--;
		return old;
	}
	
	public boolean remove(Object obj) {
		for(int i = 0; i < size; i++) {
			if(values[i].equals(obj)) {
				for(int i2 = i; i2 < size-1; i2++) {
					values[i2] = values[i2+1];
				}
				size--;
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int indexOf(Object obj) {
		for(int i = 0; i < size; i++) {
			if(values[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOfLast(Object obj) {
		for(int i = size - 1; i > 0; i--) {
			if(values[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		if(this.isEmpty()) {
			return "[]";
		} else {
			String out = "[" + this.get(0);
			for(int i = 1; i < this.size(); i++) {
				out = out.concat("," + this.get(i));
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
		return new ArrayIterator<E>(this);
	}
	
	public ListIterator<E> listIterator() {
		return new ArrayListIterator<E>(this);
	}
	
	public ListIterator<E> listIterator(int startIndex) {
		return new ArrayListIterator<E>(startIndex, this);
	}
}
