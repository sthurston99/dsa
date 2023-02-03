package list;

/**
 * Allows access to each value in a collection with selective removing.
 * @author Simon Thurston
 */
public interface Iterator<E> {
	
	/**
	 * Returns true if not at the end of a collection.
	 */
	boolean hasNext();
	
	/**
	 * Returns next value in collection.
	 * Only call if hasNext returns true.
	 */
	E next();
	
	/**
	 * Removes last value returned by next.
	 * Only call after next has been called at least once since start or last remove.
	 */
	void remove();

	/**
	 * Returns true if there are at least two more items left in the collection.
	 * @return If there are at least two more items left in the collection.
	 */
	boolean has2more();
}
