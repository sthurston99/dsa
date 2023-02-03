package stack;

/**
 * Last in First out List
 */
 
public interface StackADT<E> {
	
	E push(E value);
	
	E pop();
	
	E peek();
	
	boolean isEmpty();
	
	void clear();
	
	int size();
}