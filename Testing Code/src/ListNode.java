
/**
 * One object of this class represents one node in the linked list, class List,
 * below.
 * @param <T>
 */
public class ListNode<T> {
	private T data; // Holds whatever data is in each node

	/**
	 * get Type data
	 * @return data of type T
	 */
	T getData() {
		return data;
	}

	/**
	 * set Type data
	 * @param d type data
	 */
	void setData(T d) {
		data = d;
	}

	// don't want these to be public!!
	private ListNode<T> next; // Holds the reference to the next node in the List

	/**
	 * get Next employee in the list
	 * @return
	 */
	public ListNode<T> getNext() {
		return next;
	}

	/**
	 * set next employee in the list
	 * @param ln
	 */
	public void setNext(ListNode<T> ln) {
		next = ln;
	}

	/**
	 * default constructor
	 * @param d
	 */
	public ListNode(T d) {
		initialize(d, null);
	}

	/**
	 * parameterized constructor
	 * @param d
	 * @param n
	 */
	public ListNode(T d, ListNode<T> n) {
		initialize(d, n);
	}

	/**
	 * Private method to create a list node
	 * @param d object of type T
	 * @param n next list node
	 */
	private void initialize(T d, ListNode<T> n) {
		setData(d);
		setNext(n);
	}

	/**
	 * tostring
	 */
	public String toString() // Returns the data in one node
	{
		return "" + getData(); // this automatically calls getData().toString()
	}
}
