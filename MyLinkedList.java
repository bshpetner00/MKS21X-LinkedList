public class MyLinkedList {
	private int length;
	private Node start,end;
	public MyLinkedList() {
		length = 0;
	}
	public int size() {
		return length;
	}
	public boolean add(int value) { //adds a value to the end of the list
		Node newbie = new Node(value);
		if (length == 0) { //for empty list
			start = newbie;
			end = newbie;
		}
		else { //for list of 1 or more items
			end.setNext(newbie);
			newbie.setPrev(end);
			end = newbie;
		}
		length++;
		return true;
	}
	public String toString() { //makes a String representation of the list
		if (length == 0) { //for empty list
			return "{}";
		}
		if (length == 1) { //for list of 1 item
			return "{" + start.toString() + "}";
		}
		Node i = start.next();
		String output = "{" + start.toString();
		while (i != null) {
			output = output + ", " + i.toString();
			i = i.next();
		}
		return output + "}";
	}
	private Node getNode(int i) throws IndexOutOfBoundsException { //finds node of list at given index
		if (i > length-1 || i < 0) {
			throw new IndexOutOfBoundsException("Node with given index not found");
		}
		Node nod = start;
		while (i > 0) { //loops through the list - linear
			nod = nod.next();
			i--;
		}
		return nod;
	}
	public int get(int i) throws IndexOutOfBoundsException { //finds value of node at given index
		if (i > length-1 || i < 0) {
			throw new IndexOutOfBoundsException("Given index not found");
		}
		return (this.getNode(i)).getData();
	}
	public int set(int i, int val) throws IndexOutOfBoundsException { //sets value of node at given index
		if (i > length-1 || i < 0) {
			throw new IndexOutOfBoundsException("No node at given index");
		}	
		return this.getNode(i).setData(val);
	}
	public boolean contains(int val) {
		if (length == 0) { //empty list
			return false;
		}
		Node i = start;
		while (i != null) { //goes through entire list - linear
			if (i.getData() == val) {
				return true;
			}
			else {
				i = i.next();
			}
		}
		return false;
	}
	public int indexOf(int val) {
		if (length == 0) { //empty list
			return -1;
		}
		Node i = start;
		int index = 0;
		while (i != null) { //goes through entire list - linear
			if (i.getData() == val) {
				return index;
			}
			i = i.next();
			index++;
		}
		return -1;
	}
	public void add(int i, int val) throws IndexOutOfBoundsException { //inserts value into given index of list
		if (i > length-1 || i < 0) {
			throw new IndexOutOfBoundsException("Given index not found");
		}
		Node noob = new Node(val);
		if (i == length-1) { //adds to end
			end.setNext(noob);
			noob.setPrev(end);
			end = noob;
			length++;
		}
		else if (i == 0) { //adds to beginning
			noob.setNext(start);
			start.setPrev(noob);
			start = noob;
			length++;
		}
		else { //adds not at end or beginning
			noob.setPrev(this.getNode(i-1));
			noob.setNext(this.getNode(i));
			this.getNode(i-1).setNext(noob);
			this.getNode(i).setPrev(noob);
			length++;
		}
	}
}
