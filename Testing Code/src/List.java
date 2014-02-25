/**
 * One object of this class represents a linked list of EmployeeNode objects, above.
 */
public class List <T>{
	
	private ListNode<T> first; // A reference to the first node in the list

	/**
	 * gets the first node in the list
	 * @return ListNode first
	 */
	private ListNode<T> getFirst() {
		return first;
	}

	/**
	 * Sets the new first in the list
	 * @param newFirst
	 */
	private void setFirst(ListNode<T> newFirst) {
		first = newFirst;
	}

	/**
	 * default Constructor with a null first
	 */
	public List() {
		setFirst(null);
	}

	/**
	 * Makes a new node containing "d" and links it to the end of List.
	 */
	public void add(T d) {
		if (getFirst() == null)
			setFirst(new ListNode<T>(d));
		else if (getFirst().getNext() == null)
			getFirst().setNext(new ListNode<T>(d));
		else {
			ListNode<T> temp = getFirst().getNext();
			while (temp.getNext() != null)
				// We know that (temp != null)
				temp = temp.getNext();
			temp.setNext(new ListNode<T>(d));
		}
	}
	public List<T> returnAllOfType(String className) throws ClassNotFoundException{
		List<T> toReturn = new List<T>();
		if(getFirst() == null){
			return null;
		}else{
			ListNode<T> temp = getFirst();
			while(temp.getNext() !=  null){
				//System.out.println(temp.getData().getClass());
				if(Class.forName(className).isInstance( temp.getData())){
					toReturn.add(temp.getData());
				}
				temp = temp.getNext();	
			}
			//run one more time because the last ListNode has null but may stil have data
			System.out.println(temp.getData().getClass());
			if(Class.forName(className).isInstance( temp.getData())){
				toReturn.add(temp.getData());
			}
		}
		return toReturn;
		
	}
	
	public List<T> searchTitle(String title){
		List<T> toReturn = new List<T>();
		if(getFirst() == null){
			return null;
		}
		ListNode<T> temp = getFirst();
		while(temp.getNext() != null){
			System.out.println("Got into the while loop");
			System.out.println(((CustomMedia)temp.getData()).getName());
			if(( ((CustomMedia) temp.getData()).getName()).equals(title)){
				toReturn.add(temp.getData());
			}
			temp = temp.getNext();
		}
		if(( ((CustomMedia) temp.getData()).getName()).equals(title)){
			toReturn.add(temp.getData());
		}

		
		return toReturn;
	}
	
	public List<T> searchTitleAndClass(String title, String className){
		List<T> toReturn = new List<T>();
		toReturn = this.searchTitle(title);
		try {
			toReturn = toReturn.returnAllOfType(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return toReturn;
	}
	/**
	 * ToString method for the entire employee list. Goes through the entire list and prints everything.
	 * @return String
	 */
	public String toString(){
		String toReturn = "";
		ListNode<T> temp = getFirst();
		while(temp != null){
			toReturn += temp.toString() + "\n";
			temp = temp.getNext();
		}
		return toReturn;
	}
}

