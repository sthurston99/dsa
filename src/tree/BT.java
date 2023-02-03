package tree;

public interface BT<E> {
	
	E getValue();
	
	/**
	 * Search the family of this BT for the given value.
	 * @param value The value to search for.
	 * @return Returns value if found, null if not found.
	 */
	E get(E value);
	
	/**
	 * Returns true iff the given object is in the family of this BT.
	 * @param obj The object to search for.
	 * @return Whether or not the object is in the family of this BT.
	 */
	boolean containsKey(Object obj);
	
	/**
	 * Add the given value to the family of this BT.
	 * @param value The value to add to the BT.
	 * @return The resulting BT.
	 */
	BT<E> add(E value);
	
	/**
	 * Sets the left child of the BT to the given BT.
	 * @param tree The BT to set as the left child.
	 */
	void setLeft(BT<E> tree);
	
	/**
	 * Sets the right child of the BT to the given BT.
	 * @param tree The BT to set as the right child.
	 */
	void setRight(BT<E> tree);
	
	/**
	 * Change the value of this BT.
	 * @param value The value to set.
	 */
	void setValue(E value);
	
	int size();
}
