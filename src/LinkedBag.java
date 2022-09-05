/** OUTLINE
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public class LinkedBag<T> implements ShoppingCart<T>
{
	private Node firstNode;       // reference to first node
	private int numberOfEntries;

	public LinkedBag()
	{
		firstNode = null;
      numberOfEntries = 0;
	} // end default constructor

   // . . .

	private class Node
	{
	   private T    data; // Entry in bag
	   private Node next; // Link to next node
      
		private Node(T dataPortion)
		{
			this(dataPortion, null);
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		} // end constructor
		
	} // end Node

	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty = false;
		if (numberOfEntries != 0)
			empty = true;

		return empty;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node (newEntry);
		newNode.next = firstNode;
		firstNode = newNode;
		
		numberOfEntries++;
		return true;
		
	}//end add 

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		T result = null;
		if (firstNode != null)
		{
			result = firstNode.data;
			firstNode = firstNode.next; //remove first node from chain
			
			numberOfEntries--;
		}//end if
		return result;
	}//end remove
	
	
	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		boolean result = false;
		Node nodeN = getRefernceTo(anEntry);
		if (nodeN != null)
		{
			nodeN.data = firstNode.data;
			
			firstNode = firstNode.next;
			
			numberOfEntries--;
			result = true;
		}//end if statement
		return result;
	}//end remove
	
private Node getRefernceTo (T anEntry) {
		
		boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		}//end while
		return currentNode;
		
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while (!isEmpty())
			remove();
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		int frequency =0;
		int loopCounter = 0;
		Node currentNode = firstNode;
		while ((loopCounter < numberOfEntries)&&(currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				frequency++;
				loopCounter++;
				currentNode = currentNode.next;
		}//end while loop
		return frequency;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		}//end while loop
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfEntries];
		
		int index = 0;
		Node currentNode = firstNode;
		while ((index < numberOfEntries) && (currentNode != null))
		{
			result[index] = currentNode.data;
			index++;
			currentNode = currentNode.next;
			
		}//end while
		
		return result;
	}
} // end LinkedBag