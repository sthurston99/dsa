package list;

public interface ListIterator<E> extends Iterator<E> {
	
	/**
	 * Return whether or not a previous value exists.
	 * @return Whether or not a previous value exists.
	 */
	boolean hasPrevious();
	
	/**
	 * Returns the previous value in the list.
	 * hasPrevious must be true before calling.
	 * @return The previous value in the list.
	 */
	E previous();
	
	/**
	 * Removes the last returned value in the list.
	 * next or previous must have been called at least once prior to calling this.
	 */
	void remove();
	
	/**
	 * Adds the given value prior to the current cursor position.
	 * @param value The value to add.
	 */
	void add(E value);
	
}
