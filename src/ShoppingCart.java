/**
 * An interface that describes the operations of a bag of objects
 * @author johnthomas
 */
public interface ShoppingCart<T> {

	/**
	 * Gets the current number of entries in this bag 
	 * @return the number of entries in this bag 
	 */
	public int getCurrentSize();
	/**
	 * Checks to see if bag is empty
	 * @return true if bag is empty, false if not
	 */
	public boolean isEmpty();
	/**
	 * adds a new entry to this bag
	 * @param newEntry
	 * @return true if the addition is successful, false if not
	 */
	public boolean add(T newEntry);
	/**
	 * removes one unspecified entry from this bag if possible
	 * @return either the removed entry if successfully removed, or null
	 */
	public T remove();
	/**
	 * removes one occurrence if possible
	 * @param entry to be removed 
	 * return true if removed, false if not
	 */
	public boolean remove (T anEntry);
	/**
	 * removes all entries from this bag
	 * 
	 */
	public void clear();
	/**
	 * counts the number of times a given entry appears in this bag 
	 * @param anEntry
	 * @return number of times entry appears in this bag
	 */
	public int getFrequencyOf (T anEntry);
	/**
	 * tests whether this bag contains a given entry
	 * 
	 */
	public boolean contains (T anEntry);
	/**
	 * Retrieves all entries that are in this bag
	 */
	public T[] toArray();
}//end interface
