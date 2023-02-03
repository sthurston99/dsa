package list;

/**
 * Abstract Data Type
 * List: Has order, Has Duplicates
 * @author Simon Thurston
 */
public interface List<E> {
	/**
	 * Gets the value at a given index.
	 * @param index The index whose value to retrieve.
	 * @return The value at the given index.
	 * @param 0<=index<size
	 */
	E get(int index);
	
	/**
	 * Change the value at a given index.
	 * @param index The index whose value to retrieve.
	 * @param value The value to set.
	 * @return The value previously stored at the index.
	 * @param 0<=index<size
	 */
	E set(int index, E value);
	
	/**
	 * Add the value at the end of the list.
	 * @param value The value to add.
	 */
	void add(E value);
	
	/**
	 * Inserts the value at a given index.
	 * @param index The index to add at.
	 * @param value The value to add.
	 * @param 0<=index<=size
	 */
	void add(int index, E value);
	
	/**
	 * Removes the value at the specified index.
	 * @param index The index whose value to remove.
	 * @return The previously stored value at the index.
	 * @param 0<=index<size
	 */
	E remove(int index);
	
	/**
	 * Removes the first occurrence a given object from the list.
	 * @param obj The object to remove.
	 * @return Whether or not the operation was successful.
	 */
	boolean remove(Object obj);
	
	/**
	 * Returns the size of the list.
	 * @return The size of the list.
	 */
	int size();
	
	/**
	 * Clears the list.
	 */
	void clear();
	
	/**
	 * Returns true iff the list is empty.
	 * @return Whether or not the list is empty.
	 */
	boolean isEmpty();
	
	/**
	 * Finds the first occurrence of this object in the list, returns -1 if not found.
	 * @param obj The object to find in the list.
	 * @return The index of the object in the list, -1 if not found.
	 */
	int indexOf(Object obj);
	
	/**
	 * Finds the last occurance of this object in the list, returns -1 if not found.
	 * @param obj The object to find in the list.
	 * @return The index of the object in the list, -1 if not found.
	 */
	int indexOfLast(Object obj);
	
	/**
	 * Returns whether or not the list contains the given object.
	 * @param obj The object to search for.
	 * @return True iff the list contains the given object. 
	 */
	default boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}
	
	/**
	 * Returns true if the contents of this list are equal to the list object passed in.
	 * @param obj The list object to test. Must be a list.
	 * @return Whether or not the lists are equal.
	 */
	boolean equals(Object obj);
	
	/**
	 * Returns an iterator for the given list.
	 * @return A list iterator for the given list.
	 */
	Iterator<E> iterator();
	
	/**
	 * Returns a list iterator for the given list.
	 * @return A list iterator for the given list.
	 */
	ListIterator<E> listIterator();
	
	
	/**
	 * Returns a list iterator for the given list starting at the given starting index.
	 * @param The index for the list iterator to start at.
	 * @return A list iterator for the given list.
	 */
	ListIterator<E> listIterator(int startIndex);
	
	/**
	 * Adds all the items of a List to the current list.
	 * @param list The list whose items are being added to the current list.
	 */
	default void addAll(List<E> list) {
		Iterator<E> it = list.iterator();
		while(it.hasNext()) {
			this.add(it.next());
		}
	}
}
